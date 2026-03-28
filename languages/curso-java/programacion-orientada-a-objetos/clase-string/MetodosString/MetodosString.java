public class MetodosString {
    public static void main(String[] args) {
        // String es inmutable en Java
        String s1 = "Hola";
        String s2 = "Hola";
        String s3 = new String("Hola");

        // == compara referencias, .equals() compara contenido
        System.out.println("s1 == s2:         " + (s1 == s2));       // true (pool)
        System.out.println("s1 == s3:         " + (s1 == s3));       // false
        System.out.println("s1.equals(s3):    " + s1.equals(s3));    // true

        // Metodos de String
        String texto = "Java es un lenguaje orientado a objetos";
        System.out.println("\nLength:           " + texto.length());
        System.out.println("toUpperCase:      " + texto.toUpperCase());
        System.out.println("substring(0,4):   " + texto.substring(0, 4));
        System.out.println("indexOf('es'):    " + texto.indexOf("es"));
        System.out.println("replace:          " + texto.replace("Java", "Python"));
        System.out.println("split(' ').length:" + texto.split(" ").length);
        System.out.println("startsWith('Java'):" + texto.startsWith("Java"));
        System.out.println("contains('len'):  " + texto.contains("len"));
        System.out.println("trim:             '" + "  espacios  ".trim() + "'");

        // String.format
        String formateado = String.format("PI = %.5f", Math.PI);
        System.out.println("\nformat: " + formateado);

        // Comparacion de caracteres
        System.out.println("\ncompareTo:");
        System.out.println("'apple'.compareTo('banana'): " + "apple".compareTo("banana"));

        // StringBuilder para concatenacion eficiente
        System.out.println("\nStringBuilder:");
        StringBuilder sb = new StringBuilder("Hola");
        sb.append(", mundo").append("!").insert(4, " Java");
        System.out.println(sb);
        System.out.println("reverse: " + sb.reverse());
        System.out.println("length: " + sb.length());
    }
}
