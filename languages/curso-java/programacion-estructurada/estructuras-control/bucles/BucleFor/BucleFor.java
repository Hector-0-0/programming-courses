public class BucleFor {
    public static void main(String[] args) {
        // For clasico
        System.out.println("--- For clasico ---");
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        // For descendente
        System.out.println("\n--- For descendente ---");
        for (int i = 5; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        // For con array (for-each)
        System.out.println("\n--- For-Each ---");
        String[] frutas = {"Manzana", "Banana", "Cereza"};
        for (String fruta : frutas) {
            System.out.println("Fruta: " + fruta);
        }

        // For anidado - tabla de multiplicar
        System.out.println("\n--- Tabla del 1 al 3 ---");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }
}
