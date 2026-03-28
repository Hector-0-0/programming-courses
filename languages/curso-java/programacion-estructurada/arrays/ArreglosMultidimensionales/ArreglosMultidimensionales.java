import java.util.Arrays;

public class ArreglosMultidimensionales {
    public static void main(String[] args) {
        // Matriz 3x3
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("--- Matriz 3x3 ---");
        for (int[] fila : matriz) {
            for (int val : fila) {
                System.out.printf("%3d", val);
            }
            System.out.println();
        }

        System.out.println("Elemento [1][2]: " + matriz[1][2]);

        // Suma de diagonal principal
        int sumaDiagonal = 0;
        for (int i = 0; i < matriz.length; i++) {
            sumaDiagonal += matriz[i][i];
        }
        System.out.println("Suma diagonal: " + sumaDiagonal);

        // Arreglo jagged (filas de distinto tamano)
        int[][] jagged = new int[3][];
        jagged[0] = new int[]{1};
        jagged[1] = new int[]{2, 3};
        jagged[2] = new int[]{4, 5, 6};
        System.out.println("\nJagged array:");
        for (int[] fila : jagged) {
            System.out.println(Arrays.toString(fila));
        }
    }
}
