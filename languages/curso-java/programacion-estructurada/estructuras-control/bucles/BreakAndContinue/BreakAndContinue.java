public class BreakAndContinue {
    public static void main(String[] args) {
        // Break - interrumpe el bucle
        System.out.println("--- Break ---");
        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                System.out.println("Break en i = " + i);
                break;
            }
            System.out.println("i = " + i);
        }

        // Continue - salta a la siguiente iteracion
        System.out.println("\n--- Continue (pares) ---");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) continue;  // Salta impares
            System.out.print(i + " ");
        }
        System.out.println();

        // Break con etiqueta (bucles anidados)
        System.out.println("\n--- Break con etiqueta ---");
        externo:
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 1 && j == 1) break externo;
                System.out.println("i=" + i + ", j=" + j);
            }
        }
    }
}
