import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.List;

public class AFDLenguajeGrafico {

    // Tipos de categorías
    enum TokenType {
        FIGURA,       // C, R, L, P
        TEXTO,        // T
        COLOR,        // SC, FC, BG
        ESTILO,       // SW, FS
        NUMERO,       // 1, 2, 300, etc.
        HEXADECIMAL,  // #FFFFFF, etc.
        CADENA,       // "Hola mundo"
        DESCONOCIDO   // cualquier otra cosa
    }

    // Asocia cada comando con su categoría
    static final Map<String, TokenType> COMANDOS = Map.ofEntries(
            Map.entry("C", TokenType.FIGURA),
            Map.entry("R", TokenType.FIGURA),
            Map.entry("L", TokenType.FIGURA),
            Map.entry("P", TokenType.FIGURA),
            Map.entry("T", TokenType.TEXTO),
            Map.entry("SC", TokenType.COLOR),
            Map.entry("FC", TokenType.COLOR),
            Map.entry("BG", TokenType.COLOR),
            Map.entry("SW", TokenType.ESTILO),
            Map.entry("FS", TokenType.ESTILO)
    );

    static Lienzo lienzo = new Lienzo();
    static boolean fondoDefinido = false;
    static Color colorActual = Color.BLACK;
    static Color colorRellenoActual = null;
    static Integer strokeWidthActual = null;
    static Integer fontSizeActual = null;

    // Representación de un token (no usada actualmente)
    static class Token {
        String lexema;
        TokenType tipo;
        int posicion;

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

    // Clase para representar errores
    static class Error {
        String errorId;
        String tipo;
        int posicion;
        String descripcion;

        Error(String errorId, String tipo, int posicion, String descripcion) {
            this.errorId = errorId;
            this.tipo = tipo;
            this.posicion = posicion;
            this.descripcion = descripcion;
        }
    }

    // Resultado de la validación de una línea
    static class ValidationResult {
        final boolean valid;
        final Error error;

        ValidationResult(boolean valid, Error error) {
            this.valid = valid;
            this.error = error;
        }

        static ValidationResult ok() {
            return new ValidationResult(true, null);
        }

        static ValidationResult error(String code) {
            for (Error e : errorTable) {
                if (e.errorId.equals(code)) return new ValidationResult(false, e);
            }
            return new ValidationResult(false, new Error(code, "Desconocido", -1, "Error desconocido"));
        }

        boolean isValid() {
            return valid;
        }
    }

    static final Set<String> COMMANDS = COMANDOS.keySet();
    static final List<Error> errorTable = new ArrayList<>();

    // Tabla de errores predefinidos
    static void loadErrorTable() {
        errorTable.add(new Error("E001", "Léxico", -1, "Comando no reconocido."));
        errorTable.add(new Error("E003", "Léxico", -1, "Formato de color inválido. Debe ser #RRGGBB."));
        errorTable.add(new Error("E004", "Léxico", -1, "Se esperaba un color que comience con '#'"));
        errorTable.add(new Error("E007", "Léxico", -1, "No se proporcionó entrada."));

        errorTable.add(new Error("I001", "Sintáctico", -1, "Comando con parámetros de más."));
        errorTable.add(new Error("I002", "Sintáctico", -1, "Parámetro numérico inválido o faltante."));
        errorTable.add(new Error("I003", "Sintáctico", -1, "Texto mal formado. Debe ir entre comillas."));

        errorTable.add(new Error("S003", "Semántico", -1, "Texto vacío no es válido."));
        errorTable.add(new Error("S020", "Semántico", -1, "No se ha definido grosor de línea antes de dibujar."));
        errorTable.add(new Error("S021", "Semántico", -1, "No se ha definido tamaño de fuente antes de escribir texto."));
    }


    // Valida una línea de entrada
    static ValidationResult validate(String input) {
        String[] tokens = input.trim().split("\\s+");
        if (tokens.length == 0 || tokens[0].isEmpty()) return ValidationResult.error("E007");

        String cmd = tokens[0];
        if (!COMANDOS.containsKey(cmd)) return ValidationResult.error("E001");

        TokenType tipo = COMANDOS.get(cmd);

        switch (tipo) {
            case TEXTO:
                if (fontSizeActual == null) return ValidationResult.error("S021");
                if (tokens.length < 4) return ValidationResult.error("I002");
                if (!isNumeric(tokens[1]) || !isNumeric(tokens[2])) return ValidationResult.error("I002");

                String texto = String.join(" ", Arrays.copyOfRange(tokens, 3, tokens.length));
                if (!texto.startsWith("\"") || !texto.endsWith("\"")) return ValidationResult.error("I003");
                if (texto.length() <= 2) return ValidationResult.error("S003");

                return ValidationResult.ok();

            case FIGURA:
                boolean cantidadCorrecta =
                        (cmd.equals("C") && tokens.length == 4) ||
                                (cmd.equals("R") && tokens.length == 5) ||
                                (cmd.equals("L") && tokens.length == 5) ||
                                (cmd.equals("P") && tokens.length == 3);

                if (!cantidadCorrecta) return ValidationResult.error("I002");

                if ((cmd.equals("C") || cmd.equals("R") || cmd.equals("L")) && strokeWidthActual == null)
                    return ValidationResult.error("S020");

                for (int i = 1; i < tokens.length; i++)
                    if (!isNumeric(tokens[i])) return ValidationResult.error("I002");

                return ValidationResult.ok();

            case COLOR:
                if (tokens.length != 2) return ValidationResult.error("I002");
                if (!tokens[1].startsWith("#")) return ValidationResult.error("E004");
                if (!tokens[1].matches("#[0-9a-fA-F]{6}")) return ValidationResult.error("E003");
                return ValidationResult.ok();

            case ESTILO:
                if (tokens.length != 2 || !isNumeric(tokens[1])) return ValidationResult.error("I002");
                return ValidationResult.ok();
        }

        return ValidationResult.ok(); // fallback
    }


    // Verifica si una cadena es numérica
    static boolean isNumeric(String s) {
        return s.matches("-?\\d+");
    }

    // Procesa y muestra gráficamente los comandos válidos
    static void compilarYMostrar(List<String> entradas) {
        JFrame ventana = new JFrame("Lienzo - Lenguaje Grafico");
        ventana.setSize(1920, 1080);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.add(lienzo);

        for (String linea : entradas) {
            String[] tokens = linea.trim().split("\\s+");
            if (tokens.length == 0) continue;

            String cmd = tokens[0];
            try {
                switch (cmd) {
                    case "BG":
                        if (!fondoDefinido) {
                            lienzo.setFondo(Color.decode(tokens[1]));
                            fondoDefinido = true;
                        }
                        break;
                    case "SC": colorActual = Color.decode(tokens[1]); break;
                    case "FC": colorRellenoActual = Color.decode(tokens[1]); break;
                    case "SW": strokeWidthActual = Integer.parseInt(tokens[1]); break;
                    case "FS": fontSizeActual = Integer.parseInt(tokens[1]); break;
                    case "C": lienzo.agregarFigura(new Circulo(
                            Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]), Integer.parseInt(tokens[3]),
                            colorActual, colorRellenoActual, strokeWidthActual)); break;
                    case "R": lienzo.agregarFigura(new Rectangulo(
                            Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]),
                            Integer.parseInt(tokens[3]), Integer.parseInt(tokens[4]),
                            colorActual, colorRellenoActual, strokeWidthActual)); break;
                    case "L": lienzo.agregarFigura(new Linea(
                            Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]),
                            Integer.parseInt(tokens[3]), Integer.parseInt(tokens[4]),
                            colorActual, strokeWidthActual)); break;
                    case "T":
                        String contenido = linea.substring(linea.indexOf('"') + 1, linea.lastIndexOf('"'));
                        lienzo.agregarFigura(new Texto(
                                Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]),
                                contenido, colorActual, fontSizeActual)); break;
                }
                lienzo.repaint();
            } catch (Exception e) {
                System.out.println("Error procesando comando: " + linea);
                e.printStackTrace();
            }
        }

        ventana.setVisible(true);
    }
    static List<Token> tokenizar(String linea) {
        List<Token> tokens = new ArrayList<>();
        String[] partes = linea.trim().split("\\s+");

        for (int i = 0; i < partes.length; i++) {
            String p = partes[i];
            TokenType tipo;

            if (COMANDOS.containsKey(p)) {
                tipo = COMANDOS.get(p);
            } else if (p.matches("-?\\d+")) {
                tipo = TokenType.NUMERO;
            } else if (p.matches("#[0-9a-fA-F]{6}")) {
                tipo = TokenType.HEXADECIMAL;
            } else if (p.startsWith("\"") && p.endsWith("\"")) {
                tipo = TokenType.CADENA;
            } else {
                tipo = TokenType.DESCONOCIDO;
            }

            tokens.add(new Token(p, tipo, i));
        }

        return tokens;
    }


    // Función principal: carga el archivo, valida entradas y compila
    public static void main(String[] args) {
        System.out.println("Compilando y mostrando graficamente...");
        loadErrorTable();

        if (args.length == 0) {
            System.out.println("Uso: java AFDLenguajeGrafico archivo.dd");
            return;
        }

        File archivo = new File(args[0]);
        if (!archivo.exists()) {
            System.out.println("Archivo no encontrado.");
            return;
        }

        List<String> entradas = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                if (!linea.trim().isEmpty()) entradas.add(linea.trim());
            }
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        // Preprocesa configuraciones antes de validación completa
        for (String entrada : entradas) {
            String[] tokens = entrada.trim().split("\\s+");
            if (tokens.length < 2) continue;
            switch (tokens[0]) {
                case "SC": colorActual = Color.decode(tokens[1]); break;
                case "FC": colorRellenoActual = Color.decode(tokens[1]); break;
                case "BG":
                    if (!fondoDefinido) {
                        lienzo.setFondo(Color.decode(tokens[1]));
                        fondoDefinido = true;
                    }
                    break;
                case "SW": strokeWidthActual = Integer.parseInt(tokens[1]); break;
                case "FS": fontSizeActual = Integer.parseInt(tokens[1]); break;
            }
        }

        // Validación línea por línea
        boolean errores = false;
        System.out.println("=== Tabla de Simbolos ===");
        for (String entrada : entradas) {
            System.out.println("Entrada: " + entrada);
            List<Token> tokens = tokenizar(entrada);
            tokens.forEach(System.out::println);

            ValidationResult resultado = validate(entrada);
            if (!resultado.isValid()) {
                System.out.printf("[%s | %s] %s%n", resultado.error.tipo, resultado.error.errorId, resultado.error.descripcion);
                errores = true;
            }

            System.out.println();
        }




        // Si no hay errores, ejecutar visualización
        if (!errores) compilarYMostrar(entradas);
        else System.out.println("El programa contiene errores y no puede ejecutarse.");
    }
}
