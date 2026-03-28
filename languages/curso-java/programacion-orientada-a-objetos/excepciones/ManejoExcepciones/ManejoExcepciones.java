public class ManejoExcepciones {
    public static void main(String[] args) {
        // Try-Catch basico
        System.out.println("--- Division ---");
        try {
            int resultado = 10 / 0;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Multiple catch
        System.out.println("\n--- Multiple catch ---");
        String[] arr = {"42", "abc", null};
        for (String s : arr) {
            try {
                int n = Integer.parseInt(s);
                System.out.println("Numero: " + n);
            } catch (NumberFormatException e) {
                System.out.println("No es numero: '" + s + "'");
            } catch (NullPointerException e) {
                System.out.println("El valor es null");
            }
        }

        // Catch multiple tipos (Java 7+)
        System.out.println("\n--- Multi-catch ---");
        try {
            Object obj = null;
            obj.toString();
        } catch (NullPointerException | IllegalArgumentException e) {
            System.out.println("Excepcion capturada: " + e.getClass().getSimpleName());
        }

        // Finally
        System.out.println("\n--- Finally ---");
        try {
            System.out.println("Ejecutando try");
            int[] nums = {1, 2, 3};
            System.out.println(nums[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Indice fuera de rango: " + e.getMessage());
        } finally {
            System.out.println("Finally siempre se ejecuta");
        }

        // Checked vs Unchecked (simulacion)
        System.out.println("\n--- Stack trace controlado ---");
        try {
            metodoConError();
        } catch (Exception e) {
            System.out.println("Capturado en main: " + e.getMessage());
        }
    }

    static void metodoConError() throws Exception {
        throw new Exception("Error lanzado desde metodoConError");
    }
}
