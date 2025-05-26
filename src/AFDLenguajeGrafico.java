// ... tus imports
import java.io.*;
import java.util.*;

public class AFDLenguajeGrafico {

    enum State {
        START, C, R, L, T, P, SC, FC, SW, FS, BG, CLS, END, TR, RT, SCAL, SELEC,
        SPACE, COLOR, ACCEPT
    }

    enum TokenType {
        COMANDO, NÚMERO, COLOR_HEX, TEXTO
    }

    static class Token {
        final String lexema;
        final TokenType tipo;
        final int posicion;

        Token(String lexema, TokenType tipo, int posicion) {
            this.lexema = lexema;
            this.tipo = tipo;
            this.posicion = posicion;
        }

        @Override
        public String toString() {
            return String.format("%s\t%s\t%d", lexema, tipo, posicion);
        }
    }

    static class Error {
        String errorId;
        String tipo;
        int posicion;
        String descripcion;

        public Error(String errorId, String tipo, int posicion, String descripcion) {
            this.errorId = errorId;
            this.tipo = tipo;
            this.posicion = posicion;
            this.descripcion = descripcion;
        }

        @Override
        public String toString() {
            return String.format("Error(id=%s, tipo=%s, posición=%d, desc=%s)",
                    errorId, tipo, posicion, descripcion);
        }
    }

    static final Set<String> COMMANDS = Set.of(
            "C", "R", "L", "T", "P", "SC", "FC", "SW", "FS",
            "BG", "CLS", "END", "TR", "RT", "SCAL", "SELEC"
    );

    static final List<Error> errorTable = new ArrayList<>();

    static void loadErrorTable() {
        errorTable.add(new Error("E001", "Comando no válido", -1, "Comando no reconocido."));
        errorTable.add(new Error("E002", "Error de Sintaxis", -1, "Comando con parámetros de más."));
        errorTable.add(new Error("E003", "Formato de Color", -1, "Formato de color inválido. Debe ser #RRGGBB."));
        errorTable.add(new Error("E004", "Color Esperado", -1, "Se esperaba un color que comience con '#'"));
        errorTable.add(new Error("E005", "Parámetro Inválido", -1, "Parámetro numérico inválido o faltante."));
        errorTable.add(new Error("E007", "Entrada Vacía", 0, "No se proporcionó entrada."));
        errorTable.add(new Error("E008", "Texto Mal Formado", -1, "Texto mal formado. Debe ir entre comillas."));
        errorTable.add(new Error("E009", "Error General", -1, "Error de validación inesperado."));
    }

    public static List<Token> tokenize(String input) {
        List<Token> tokens = new ArrayList<>();
        int i = 0;

        while (i < input.length()) {
            while (i < input.length() && Character.isWhitespace(input.charAt(i))) i++;
            if (i >= input.length()) break;

            int start = i;

            if (input.charAt(i) == '"') {
                i++;
                while (i < input.length() && input.charAt(i) != '"') i++;
                if (i < input.length()) i++;
                String lexema = input.substring(start, i);
                tokens.add(new Token(lexema, TokenType.TEXTO, start));
            } else {
                while (i < input.length() && !Character.isWhitespace(input.charAt(i))) i++;
                String lexema = input.substring(start, i);

                TokenType tipo;
                if (COMMANDS.contains(lexema)) {
                    tipo = TokenType.COMANDO;
                } else if (lexema.matches("-?\\d+(\\.\\d+)?")) {
                    tipo = TokenType.NÚMERO;
                } else if (lexema.matches("#[0-9a-fA-F]{6}")) {
                    tipo = TokenType.COLOR_HEX;
                } else {
                    tipo = TokenType.TEXTO;
                }

                tokens.add(new Token(lexema, tipo, start));
            }
        }

        return tokens;
    }

    public static ValidationResult validate(String input) {
        String[] tokens = input.trim().split("\\s+");
        if (tokens.length == 0) return ValidationResult.error("E007");

        State state = State.START;
        int tokenIndex = 0;
        State currentCommand = null;

        while (true) {
            switch (state) {
                case START:
                    if (tokenIndex >= tokens.length) return ValidationResult.error("E007");
                    String cmd = tokens[tokenIndex];
                    if (!COMMANDS.contains(cmd)) return ValidationResult.error("E001");
                    currentCommand = State.valueOf(cmd);
                    state = currentCommand;
                    tokenIndex++;
                    break;

                case END:
                case CLS:
                    return tokenIndex == tokens.length
                            ? ValidationResult.ok()
                            : ValidationResult.error("E002");

                case C: case R: case L: case P:
                case SW: case FS: case TR: case RT:
                case SCAL: case SELEC:
                    state = State.SPACE;
                    break;

                case SC: case FC: case BG:
                    state = State.SPACE;
                    break;

                case T:
                    if (tokenIndex + 2 > tokens.length) return ValidationResult.error("E005");
                    if (!isNumeric(tokens[tokenIndex]) || !isNumeric(tokens[tokenIndex + 1]))
                        return ValidationResult.error("E005");
                    tokenIndex += 2;
                    StringBuilder texto = new StringBuilder();
                    while (tokenIndex < tokens.length) {
                        texto.append(tokens[tokenIndex++]).append(" ");
                    }
                    String textoFinal = texto.toString().trim();
                    if (!textoFinal.startsWith("\"") || !textoFinal.endsWith("\""))
                        return ValidationResult.error("E008");
                    return ValidationResult.ok();

                case SPACE:
                    if (tokenIndex >= tokens.length)
                        return ValidationResult.error("E007");

                    if (currentCommand == State.SC || currentCommand == State.FC || currentCommand == State.BG) {
                        state = State.COLOR;
                        break;
                    }

                    while (tokenIndex < tokens.length && isNumeric(tokens[tokenIndex])) {
                        tokenIndex++;
                    }
                    state = State.ACCEPT;
                    break;

                case COLOR:
                    if (tokenIndex >= tokens.length)
                        return ValidationResult.error("E005");

                    String colorParam = tokens[tokenIndex];
                    if (!colorParam.startsWith("#"))
                        return ValidationResult.error("E004");
                    if (colorParam.length() != 7 || !isHexColor(colorParam.substring(1)))
                        return ValidationResult.error("E003");
                    tokenIndex++;
                    state = tokenIndex == tokens.length ? State.ACCEPT : State.START;
                    break;

                case ACCEPT:
                    return tokenIndex == tokens.length
                            ? ValidationResult.ok()
                            : ValidationResult.error("E002");

                default:
                    return ValidationResult.error("E009");
            }
        }
    }

    private static boolean isHexColor(String s) {
        return s.matches("[0-9a-fA-F]{6}");
    }

    private static boolean isNumeric(String s) {
        return s.matches("-?\\d+(\\.\\d+)?");
    }

    public static void main(String[] args) {
        loadErrorTable(); // ← ¡Muy importante!

        String path = "C:\\Universidad\\Semestre V\\Compiladores\\entradas.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            int lineNumber = 1;
            while ((line = br.readLine()) != null) {
                System.out.printf("Línea %02d: \"%s\"%n", lineNumber, line);
                ValidationResult result = validate(line);
                List<Token> tokens = tokenize(line);
                int id = 1;
                for (Token token : tokens) {
                    System.out.printf("T%03d\t%s%n", id++, token);
                }
                if (result.isValid()) {
                    System.out.println("✔ Válido\n");
                } else {
                    System.out.println("✘ " + result.error + "\n");
                }
                lineNumber++;
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    static class ValidationResult {
        final boolean valid;
        final Error error;

        private ValidationResult(boolean valid, Error error) {
            this.valid = valid;
            this.error = error;
        }

        static ValidationResult ok() {
            return new ValidationResult(true, null);
        }

        static ValidationResult error(String code) {
            for (Error err : errorTable) {
                if (err.errorId.equals(code)) {
                    return new ValidationResult(false, err);
                }
            }
            return new ValidationResult(false, new Error(code, "Desconocido", -1, "Error desconocido"));
        }

        boolean isValid() {
            return valid;
        }
    }
}

