import java.util.ArrayList;
import java.util.Collections;

public class ArrayListBasico {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();

        // Agregar elementos
        lista.add("Manzana");
        lista.add("Banana");
        lista.add("Cereza");
        lista.add("Durazno");

        System.out.println("Lista: " + lista);
        System.out.println("Tamano: " + lista.size());
        System.out.println("Elemento [1]: " + lista.get(1));

        // Modificar
        lista.set(1, "Blueberry");
        System.out.println("Despues de set: " + lista);

        // Eliminar
        lista.remove("Cereza");
        System.out.println("Despues de remove: " + lista);

        // Buscar
        System.out.println("Contiene 'Manzana': " + lista.contains("Manzana"));
        System.out.println("Indice de 'Manzana': " + lista.indexOf("Manzana"));

        // Ordenar
        Collections.sort(lista);
        System.out.println("Ordenada: " + lista);

        // Iterar
        System.out.println("Iterando:");
        for (String fruta : lista) {
            System.out.println("  - " + fruta);
        }
    }
}
