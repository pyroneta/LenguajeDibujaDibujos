import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Set;

public class AFDLenguajeGrafico {

    enum State {
        START, C, R, L, T, P, SC, FC, SW, FS, BG, CLS, END, TR, RT, SCAL, SELEC,
        SPACE, COLOR, ACCEPT
    }

    static final Set<String> COMMANDS = Set.of(
            "C", "R", "L", "T", "P", "SC", "FC", "SW", "FS",
            "BG", "CLS", "END", "TR", "RT", "SCAL", "SELEC"
    );

    public static ValidationResult validate(String input) {
        String[] tokens = input.trim().split("\\s+");
        if (tokens.length == 0) return ValidationResult.error("E007", "Entrada vacía");

        State state = State.START;
        int tokenIndex = 0;
        State currentCommand = null; // guardamos el comando actual

        while (true) {
            switch (state) {
                case START:
                    if (tokenIndex >= tokens.length) return ValidationResult.error("E007", "Entrada vacía");
                    String cmd = tokens[tokenIndex];
                    if (!COMMANDS.contains(cmd)) return ValidationResult.error("E001", "Comando no reconocido");
                    currentCommand = State.valueOf(cmd); // guardamos el comando
                    state = currentCommand;
                    tokenIndex++;
                    break;

                case END:
                case CLS:
                    return tokenIndex == tokens.length
                            ? ValidationResult.ok()
                            : ValidationResult.error("E002", "Se esperaba fin de línea");

                case C: case R: case L: case P:
                case SW: case FS: case TR: case RT:
                case SCAL: case SELEC:
                    state = State.SPACE;
                    break;

                case SC: case FC: case BG:
                    state = State.SPACE;
                    break;

                case T:
                    if (tokenIndex + 2 > tokens.length) return ValidationResult.error("E005", "Faltan coordenadas o texto en comando T");
                    if (!isNumeric(tokens[tokenIndex]) || !isNumeric(tokens[tokenIndex + 1]))
                        return ValidationResult.error("E005", "Coordenadas no válidas en comando T");
                    tokenIndex += 2;
                    StringBuilder texto = new StringBuilder();
                    while (tokenIndex < tokens.length) {
                        texto.append(tokens[tokenIndex++]).append(" ");
                    }
                    String textoFinal = texto.toString().trim();
                    if (!textoFinal.startsWith("\"") || !textoFinal.endsWith("\""))
                        return ValidationResult.error("E008", "Texto en T debe iniciar y terminar con comillas");
                    return ValidationResult.ok();

                case SPACE:
                    if (tokenIndex >= tokens.length)
                        return currentCommand == State.T
                                ? ValidationResult.error("E007", "Falta texto en comando T")
                                : ValidationResult.error("E005", "Faltan parámetros");

                    if (currentCommand == State.SC || currentCommand == State.FC || currentCommand == State.BG) {
                        state = State.COLOR;
                        break;
                    }

                    String param = tokens[tokenIndex];
                    if (!isNumeric(param)) return ValidationResult.error("E005", "Parámetro numérico inválido");
                    while (tokenIndex < tokens.length && isNumeric(tokens[tokenIndex])) {
                        tokenIndex++;
                    }
                    state = State.ACCEPT;
                    break;

                case COLOR:
                    if (tokenIndex >= tokens.length)
                        return ValidationResult.error("E005", "Falta parámetro color");

                    String colorParam = tokens[tokenIndex];
                    if (!colorParam.startsWith("#"))
                        return ValidationResult.error("E004", "Falta símbolo '#' en color");
                    if (colorParam.length() != 7 || !isHexColor(colorParam.substring(1)))
                        return ValidationResult.error("E003", "Color hexadecimal inválido");
                    tokenIndex++;
                    state = tokenIndex == tokens.length ? State.ACCEPT : State.START;
                    break;

                case ACCEPT:
                    return tokenIndex == tokens.length
                            ? ValidationResult.ok()
                            : ValidationResult.error("E002", "Sobran parámetros");

                default:
                    return ValidationResult.error("E009", "Símbolo no permitido");
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
        String path = "C:\\Universidad\\Semestre V\\Compiladores\\entradas.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            int lineNumber = 1;
            while ((line = br.readLine()) != null) {
                ValidationResult result = validate(line);
                if (result.isValid()) {
                    System.out.printf("Línea %02d: \"%s\" => ✔ Válido%n", lineNumber, line);
                } else {
                    System.out.printf("Línea %02d: \"%s\" => ✘ %s - %s%n",
                            lineNumber, line, result.code, result.message);
                }
                lineNumber++;
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    static class ValidationResult {
        final boolean valid;
        final String code;
        final String message;

        private ValidationResult(boolean valid, String code, String message) {
            this.valid = valid;
            this.code = code;
            this.message = message;
        }

        static ValidationResult ok() {
            return new ValidationResult(true, "", "");
        }

        static ValidationResult error(String code, String message) {
            return new ValidationResult(false, code, message);
        }

        boolean isValid() {
            return valid;
        }
    }
}
