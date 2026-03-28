import java.util.*;

public class ColeccionHashMap {
    public static void main(String[] args) {
        // HashMap<K,V>: pares clave-valor, sin orden garantizado
        HashMap<String, Integer> edades = new HashMap<>();

        edades.put("Ana",    25);
        edades.put("Carlos", 30);
        edades.put("Maria",  22);
        edades.put("Luis",   35);

        System.out.println("Mapa: " + edades);
        System.out.println("Edad de Carlos: " + edades.get("Carlos"));
        System.out.println("Contiene 'Maria': " + edades.containsKey("Maria"));
        System.out.println("Contiene valor 22: " + edades.containsValue(22));
        System.out.println("Size: " + edades.size());

        // Modificar y eliminar
        edades.put("Ana", 26);          // Actualizar
        edades.remove("Luis");          // Eliminar
        System.out.println("Despues: " + edades);

        // getOrDefault
        int edad = edades.getOrDefault("Pepe", -1);
        System.out.println("Edad de Pepe: " + edad);

        // Iterar claves
        System.out.println("\nClaves:");
        for (String clave : edades.keySet()) {
            System.out.println("  " + clave + " -> " + edades.get(clave));
        }

        // Iterar entradas
        System.out.println("\nEntradas:");
        for (Map.Entry<String, Integer> entrada : edades.entrySet()) {
            System.out.printf("  %-10s : %d%n", entrada.getKey(), entrada.getValue());
        }

        // LinkedHashMap: mantiene orden de insercion
        LinkedHashMap<String, String> capitales = new LinkedHashMap<>();
        capitales.put("Peru",       "Lima");
        capitales.put("Colombia",   "Bogota");
        capitales.put("Argentina",  "Buenos Aires");
        System.out.println("\nCapitales: " + capitales);
    }
}
