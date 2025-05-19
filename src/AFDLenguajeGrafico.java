import java.util.Set;

public class AFDLenguajeGrafico {

    enum State {
        START,      // q0
        C, R, L, T, P, SC, FC, SW, FS, BG, CLS, END, TR, RT, SCAL, SELEC,
        SPACE,
        NUM,
        TEXT,
        HASH,
        COLOR,
        ACCEPT
    }

    static final Set<String> COMMANDS = Set.of(
            "C", "R", "L", "T", "P", "SC", "FC", "SW", "FS",
            "BG", "CLS", "END", "TR", "RT", "SCAL", "SELEC"
    );

    public static boolean accepts(String input) {
        String[] tokens = input.trim().split("\\s+");
        if (tokens.length == 0) return false;

        State state = State.START;
        int i = 0;
        int tokenIndex = 0;

        while (true) {
            switch (state) {
                case START:
                    if (tokenIndex >= tokens.length) return false;
                    String cmd = tokens[tokenIndex];
                    if (!COMMANDS.contains(cmd)) return false;
                    state = State.valueOf(cmd);  // transita a estado C, R, L, etc.
                    tokenIndex++;
                    break;

                case END:
                    return tokenIndex == tokens.length;

                case CLS:
                    state = State.ACCEPT;
                    break;

                case C: case R: case L: case T: case P:
                case SW: case FS: case TR: case RT:
                case SCAL: case SELEC:
                case SC: case FC: case BG:
                    state = State.SPACE;
                    break;

                case SPACE:
                    if (tokenIndex >= tokens.length) return false;
                    String param = tokens[tokenIndex];

                    if (stateFromPreviousCommandIsColor(state)) {
                        if (param.startsWith("#")) {
                            state = State.HASH;
                        } else return false;
                    } else if (isNumeric(param)) {
                        state = State.NUM;
                    } else {
                        state = State.TEXT;
                    }
                    break;

                case NUM:
                    while (tokenIndex < tokens.length && isNumeric(tokens[tokenIndex])) {
                        tokenIndex++;
                    }
                    if (tokenIndex == tokens.length) {
                        state = State.ACCEPT;
                    } else {
                        return false;
                    }
                    break;

                case TEXT:
                    // Considera todo el texto restante como válido
                    tokenIndex = tokens.length;
                    state = State.ACCEPT;
                    break;

                case HASH:
                    String colorCode = tokens[tokenIndex];
                    if (!colorCode.startsWith("#") || colorCode.length() != 7) return false;
                    if (!isHexColor(colorCode.substring(1))) return false;
                    tokenIndex++;
                    state = State.COLOR;
                    break;

                case COLOR:
                    state = tokenIndex == tokens.length ? State.ACCEPT : State.START;
                    break;

                case ACCEPT:
                    return tokenIndex == tokens.length;

                default:
                    return false;
            }
        }
    }

    private static boolean isHexColor(String s) {
        return s.matches("[0-9a-fA-F]{6}");
    }

    private static boolean isNumeric(String s) {
        return s.matches("-?\\d+(\\.\\d+)?");
    }

    private static boolean stateFromPreviousCommandIsColor(State state) {
        return state == State.SC || state == State.FC || state == State.BG;
    }

    public static void main(String[] args) {
        String[] examples = {
                "C 100 100 50",
                "R 150 150 80 60",
                "L 0 0 200 200",
                "T 120 130 Hola mundo",
                "P 50 50",
                "SC #FF00AA",
                "FC #00FF00",
                "SW 3",
                "FS 14",
                "SELEC 90 90 250 250",
                "TR -10 20",
                "RT 45.5",
                "SCAL 1.2 1.2",
                "BG #FFFFFF",
                "CLS",
                "END",
                // Invalid examples
                "C10010050",
                "BG #FFF",
                "SC FF00AA",
                "SC #12345",
                "X 1 2 3"
        };

        for (String ex : examples) {
            System.out.printf("\"%s\" => %s%n", ex, accepts(ex) ? "✔ Válido" : "✘ Inválido");
        }
    }
}
