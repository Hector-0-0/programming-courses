import java.util.*;
import java.util.stream.Collectors;

public class ColeccionArrayList {
    public static void main(String[] args) {
        // ArrayList<T>: lista dinamica ordenada que permite duplicados
        ArrayList<String> nombres = new ArrayList<>();

        names_add: {
            nombres.add("Carlos");
            nombres.add("Ana");
            nombres.add("Luis");
            nombres.add("Maria");
            nombres.add("Ana");  // duplicado permitido
        }

        System.out.println("Lista: " + nombres);
        System.out.println("Size: " + nombres.size());
        System.out.println("Get(0): " + nombres.get(0));
        System.out.println("Contains 'Ana': " + nombres.contains("Ana"));

        nombres.remove("Luis");
        nombres.set(0, "Roberto");
        System.out.println("Despues de cambios: " + nombres);

        // Ordenar
        Collections.sort(nombres);
        System.out.println("Ordenado: " + nombres);

        // Iterar con iterador
        System.out.println("\nIterador:");
        Iterator<String> it = nombres.iterator();
        while (it.hasNext()) {
            System.out.println("  " + it.next());
        }

        // Lista de objetos
        ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(5, 1, 8, 3, 9, 2, 7));
        int max = Collections.max(numeros);
        int min = Collections.min(numeros);
        System.out.println("\nNumeros: " + numeros);
        System.out.println("Max: " + max + " | Min: " + min);

        // Filtrar con Stream (Java 8+)
        List<Integer> mayoresDe5 = numeros.stream()
            .filter(n -> n > 5)
            .sorted()
            .collect(Collectors.toList());
        System.out.println("Mayores de 5: " + mayoresDe5);
    }
}
