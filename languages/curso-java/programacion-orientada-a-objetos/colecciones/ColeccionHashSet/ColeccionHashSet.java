import java.util.*;

public class ColeccionHashSet {
    public static void main(String[] args) {
        // HashSet<T>: sin duplicados, sin orden garantizado
        HashSet<String> colores = new HashSet<>();
        colores.add("Rojo");
        colores.add("Verde");
        colores.add("Azul");
        colores.add("Rojo");   // Duplicado, ignorado
        colores.add("Verde");  // Duplicado, ignorado

        System.out.println("Set: " + colores);
        System.out.println("Size: " + colores.size());   // 3, no 5
        System.out.println("Contiene 'Azul': " + colores.contains("Azul"));

        colores.remove("Verde");
        System.out.println("Despues de remove: " + colores);

        // Operaciones de conjunto
        HashSet<Integer> setA = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        HashSet<Integer> setB = new HashSet<>(Arrays.asList(3, 4, 5, 6, 7));

        // Union
        HashSet<Integer> union = new HashSet<>(setA);
        union.addAll(setB);
        System.out.println("\nA = " + setA);
        System.out.println("B = " + setB);
        System.out.println("Union: " + union);

        // Interseccion
        HashSet<Integer> interseccion = new HashSet<>(setA);
        interseccion.retainAll(setB);
        System.out.println("Interseccion: " + interseccion);

        // Diferencia
        HashSet<Integer> diferencia = new HashSet<>(setA);
        diferencia.removeAll(setB);
        System.out.println("Diferencia A-B: " + diferencia);

        // TreeSet: mantiene orden natural
        TreeSet<String> ordenado = new TreeSet<>(Arrays.asList("Naranja", "Manzana", "Pera", "Uva"));
        System.out.println("\nTreeSet: " + ordenado);
        System.out.println("Primero: " + ordenado.first());
        System.out.println("Ultimo:  " + ordenado.last());
    }
}
