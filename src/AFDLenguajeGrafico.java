import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AFDLenguajeGrafico {

    // === ENUMERACIONES Y VARIABLES GLOBALES ===

    // Tipos de tokens reconocidos
    enum TokenType {
        FIGURA,       // Comandos de dibujo: C, R, L, P
        TEXTO,        // Comando de texto: T
        COLOR,        // Comandos de color: SC, FC, BG
        ESTILO,       // Comandos de estilo: SW, FS
        NUMERO,       // Números enteros positivos
        HEXADECIMAL,  // Colores en formato hexadecimal
        CADENA,       // Cadenas entre comillas
        DESCONOCIDO   // Cualquier otro símbolo no reconocido
    }

    // Mapa que relaciona comandos con su tipo de token
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

    // Variables globales que almacenan configuraciones
    static Lienzo lienzo = new Lienzo();
    static boolean fondoDefinido = false;
    static Color colorActual = Color.BLACK;
    static Color colorRellenoActual = null;
    static Integer strokeWidthActual = null;
    static Integer fontSizeActual = null;

    // === CLASES INTERNAS PARA TOKEN, ERRORES Y RESULTADOS ===

    // Representa un token con su tipo y posicion
    static class Token {
        String lexema;
        TokenType tipo;
        int posicion;

        Token(String lexema, TokenType tipo, int posicion) {
            this.lexema = lexema;
            this.tipo = tipo;
            this.posicion = posicion;
        }

        public String toString() {
            return String.format("%s\t%s\t%d", lexema, tipo, posicion);
        }
    }

    // Representa un error del analizador
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

    // Resultado de validacion de una linea
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

    // === CARGA DE TABLA DE ERRORES PREDEFINIDOS ===
    static void loadErrorTable() {
        errorTable.add(new Error("E001", "Lexico", -1, "Comando no reconocido"));
        errorTable.add(new Error("E003", "Lexico", -1, "Formato de color invalido Debe ser RRGGBB"));
        errorTable.add(new Error("E004", "Lexico", -1, "Se esperaba un color que comience con numeral"));
        errorTable.add(new Error("E007", "Lexico", -1, "No se proporciono entrada"));

        errorTable.add(new Error("I001", "Sintactico", -1, "Comando con parametros de mas"));
        errorTable.add(new Error("I002", "Sintactico", -1, "Parametro numerico invalido"));
        errorTable.add(new Error("I004", "Sintactico", -1, "Parametro faltante"));
        errorTable.add(new Error("I003", "Sintactico", -1, "Texto mal formado Debe ir entre comillas"));

        errorTable.add(new Error("S003", "Semantico", -1, "Texto vacio no es valido"));
        errorTable.add(new Error("S020", "Semantico", -1, "No se ha definido grosor de linea antes de dibujar"));
        errorTable.add(new Error("S021", "Semantico", -1, "No se ha definido tamano de fuente antes de escribir texto"));
    }

    // === ANALIZADOR SINTACTICO Y SEMANTICO ===
    static ValidationResult validate(String input) {
        String[] tokens = input.trim().split("\\s+");
        if (tokens.length == 0 || tokens[0].isEmpty()) return ValidationResult.error("E007");

        String cmd = tokens[0];
        if (!COMANDOS.containsKey(cmd)) return ValidationResult.error("E001");

        TokenType tipo = COMANDOS.get(cmd);

        switch (tipo) {
            case TEXTO:
                if (fontSizeActual == null) return ValidationResult.error("S021");
                if (tokens.length < 4) return ValidationResult.error("I004");
                if (!isNumeric(tokens[1]) || !isNumeric(tokens[2])) return ValidationResult.error("I002");
                String texto = String.join(" ", Arrays.copyOfRange(tokens, 3, tokens.length));
                if (!texto.startsWith("\"") || !texto.endsWith("\"")) return ValidationResult.error("I003");
                if (texto.length() <= 2) return ValidationResult.error("S003");
                return ValidationResult.ok();

            case FIGURA:
                // Determina la cantidad de tokens esperada segun el comando
                int cantidadEsperada = -1;
                if (cmd.equals("C")) {
                    cantidadEsperada = 4; // C x y r
                } else if (cmd.equals("R") || cmd.equals("L")) {
                    cantidadEsperada = 5; // R x y ancho alto ó L x1 y1 x2 y2
                } else if (cmd.equals("P")) {
                    cantidadEsperada = 3; // P x y
                }

                // Verifica si hay menos parametros de los esperados
                if (tokens.length < cantidadEsperada) return ValidationResult.error("I004"); // Faltan parametros

                // Verifica si hay mas parametros de los esperados
                if (tokens.length > cantidadEsperada) return ValidationResult.error("I001"); // Parametros de mas

                // Verifica si se definio el grosor de linea antes de dibujar figuras (excepto Punto)
                if ((cmd.equals("C") || cmd.equals("R") || cmd.equals("L")) && strokeWidthActual == null)
                    return ValidationResult.error("S020");

                // Verifica que todos los parametros numericos sean positivos y validos
                for (int i = 1; i < tokens.length; i++) {
                    if (!isNumeric(tokens[i])) return ValidationResult.error("I002");
                }

                return ValidationResult.ok();

            case COLOR:
                if (tokens.length != 2) return ValidationResult.error("I004");
                if (!tokens[1].startsWith("#")) return ValidationResult.error("E004");
                if (!tokens[1].matches("#[0-9a-fA-F]{6}")) return ValidationResult.error("E003");
                return ValidationResult.ok();

            case ESTILO:
                if (tokens.length != 2) return ValidationResult.error("I004");
                if (!isNumeric(tokens[1])) return ValidationResult.error("I002");
                return ValidationResult.ok();
        }

        return ValidationResult.ok();
    }

    // Solo permite numeros positivos
    static boolean isNumeric(String s) {
        return s.matches("\\d+");
    }

    // === TOKENIZADOR ===
    static List<Token> tokenizar(String linea) {
        List<Token> tokens = new ArrayList<>();
        Pattern pattern = Pattern.compile("\"[^\"]*\"|#\\w{6}|-?\\d+|[A-Z]+");
        Matcher matcher = pattern.matcher(linea);

        int posicion = 0;
        while (matcher.find()) {
            String p = matcher.group();
            TokenType tipo;

            if (COMANDOS.containsKey(p)) {
                tipo = COMANDOS.get(p);
            } else if (p.matches("-?\\d+")) {
                tipo = TokenType.NUMERO;
            } else if (p.matches("#[0-9a-fA-F]{6}")) {
                tipo = TokenType.HEXADECIMAL;
            } else if (p.matches("\"[^\"]*\"")) {
                tipo = TokenType.CADENA;
            } else {
                tipo = TokenType.DESCONOCIDO;
            }

            tokens.add(new Token(p, tipo, posicion));
            posicion++;
        }

        return tokens;
    }

    // === EJECUCION GRAFICA ===
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
                    case "SC":
                        colorActual = Color.decode(tokens[1]);
                        break;
                    case "FC":
                        colorRellenoActual = Color.decode(tokens[1]);
                        break;
                    case "SW":
                        strokeWidthActual = Integer.parseInt(tokens[1]);
                        break;
                    case "FS":
                        fontSizeActual = Integer.parseInt(tokens[1]);
                        break;
                    case "C":
                        lienzo.agregarFigura(new Circulo(
                                Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]), Integer.parseInt(tokens[3]),
                                colorActual, colorRellenoActual, strokeWidthActual));
                        break;
                    case "R":
                        lienzo.agregarFigura(new Rectangulo(
                                Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]),
                                Integer.parseInt(tokens[3]), Integer.parseInt(tokens[4]),
                                colorActual, colorRellenoActual, strokeWidthActual));
                        break;
                    case "L":
                        lienzo.agregarFigura(new Linea(
                                Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]),
                                Integer.parseInt(tokens[3]), Integer.parseInt(tokens[4]),
                                colorActual, strokeWidthActual));
                        break;
                    case "T":
                        String contenido = linea.substring(linea.indexOf('"') + 1, linea.lastIndexOf('"'));
                        lienzo.agregarFigura(new Texto(
                                Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]),
                                contenido, colorActual, fontSizeActual));
                        break;
                }
                lienzo.repaint();
            } catch (Exception e) {
                System.out.println("Error procesando comando: " + linea);
                e.printStackTrace();
            }
        }

        ventana.setVisible(true);
    }

    // === FUNCION PRINCIPAL ===
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
        StringBuilder contenidoArchivo = new StringBuilder(); // Para verificar si hay texto real

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                entradas.add(linea);                // guardamos todas las líneas
                contenidoArchivo.append(linea);     // acumulamos texto sin saltos de línea
            }
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        // === Verificar si el archivo está completamente vacío (ni un solo carácter visible) ===
        if (contenidoArchivo.toString().trim().isEmpty()) {
            Error e007 = new Error("E007", "Lexico", -1, "No se proporciono entrada.");
            System.out.printf("[%s | %s] %s%n", e007.tipo, e007.errorId, e007.descripcion);
            System.out.println("El programa contiene errores y no puede ejecutarse.");
            return;
        }

        // === Preprocesamiento de configuraciones antes de validar ===
        for (String entrada : entradas) {
            String[] tokens = entrada.trim().split("\\s+");
            if (tokens.length < 2) continue;

            try {
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
            } catch (Exception e) {
                // ignorar excepciones durante el preprocesamiento
            }
        }

        // === Validacion linea por linea ===
        boolean errores = false;
        System.out.println("=== Tabla de Simbolos ===");

        for (int i = 0; i < entradas.size(); i++) {
            String entrada = entradas.get(i);

            // Si la linea esta vacia o solo contiene espacios, la ignoramos
            if (entrada.trim().isEmpty()) {
                continue;
            }

            System.out.println("Linea " + (i + 1) + ": " + entrada);

            List<Token> tokens = tokenizar(entrada);
            tokens.forEach(System.out::println);

            ValidationResult resultado = validate(entrada);
            if (!resultado.isValid()) {
                System.out.printf("[%s | %s] %s%n", resultado.error.tipo, resultado.error.errorId, resultado.error.descripcion);
                errores = true;
            }

            System.out.println();
        }

        // === Si no hay errores, graficar ===
        if (!errores) {
            compilarYMostrar(entradas);
        } else {
            System.out.println("El programa contiene errores y no puede ejecutarse.");
        }
    }



}