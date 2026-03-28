import java.util.Arrays;

public class ArreglosBasicos {
    public static void main(String[] args) {
        // Declaracion e inicializacion
        int[] numeros = {10, 25, 8, 47, 3, 99, 16};

        System.out.println("Longitud del arreglo: " + numeros.length);
        System.out.println("Primer elemento:      " + numeros[0]);
        System.out.println("Ultimo elemento:      " + numeros[numeros.length - 1]);

        // Recorrer con for
        System.out.print("Elementos: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();

        // For-each
        System.out.print("For-each: ");
        for (int n : numeros) {
            System.out.print(n + " ");
        }
        System.out.println();

        // Ordenar
        Arrays.sort(numeros);
        System.out.println("Ordenado: " + Arrays.toString(numeros));

        // Buscar (array debe estar ordenado)
        int pos = Arrays.binarySearch(numeros, 25);
        System.out.println("Posicion de 25: " + pos);

        // Arreglo de Strings
        String[] paises = {"Peru", "Colombia", "Mexico", "Argentina"};
        Arrays.sort(paises);
        System.out.println("Paises: " + Arrays.toString(paises));
    }
}
