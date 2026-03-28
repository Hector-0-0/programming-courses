public class MetodosString {
    public static void main(String[] args) {
        String texto = "  Hola Mundo en Java  ";

        // Longitud y acceso
        System.out.println("Original:       '" + texto + "'");
        System.out.println("length():       " + texto.length());
        System.out.println("charAt(2):      " + texto.charAt(2));

        // Transformaciones
        System.out.println("toUpperCase:    " + texto.toUpperCase());
        System.out.println("toLowerCase:    " + texto.toLowerCase());
        System.out.println("trim():         '" + texto.trim() + "'");
        System.out.println("strip():        '" + texto.strip() + "'");

        // Busqueda
        String s = "Java es genial y Java es potente";
        System.out.println("\ncontains('Java'):     " + s.contains("Java"));
        System.out.println("indexOf('Java'):      " + s.indexOf("Java"));
        System.out.println("lastIndexOf('Java'):  " + s.lastIndexOf("Java"));
        System.out.println("startsWith('Java'):   " + s.startsWith("Java"));
        System.out.println("endsWith('potente'):  " + s.endsWith("potente"));

        // Substrings y reemplazo
        System.out.println("\nsubstring(0,4):       " + s.substring(0, 4));
        System.out.println("replace('Java','JS'): " + s.replace("Java", "JS"));
        System.out.println("replaceAll('[aeiou]','*'): " + s.replaceAll("[aeiou]", "*"));

        // Division
        String csv = "uno,dos,tres,cuatro";
        String[] partes = csv.split(",");
        System.out.println("\nsplit(',') da " + partes.length + " partes:");
        for (String p : partes) System.out.println("  - " + p);

        // Formateo
        String formateado = String.format("Nombre: %-10s | Edad: %3d | Nota: %.2f", "Ana", 22, 9.75);
        System.out.println("\nFormateo: " + formateado);

        // StringBuilder (mutable, mas eficiente)
        StringBuilder sb = new StringBuilder();
        sb.append("Hello").append(" ").append("World");
        sb.insert(5, ",");
        sb.reverse();
        System.out.println("\nStringBuilder: " + sb);
    }
}
