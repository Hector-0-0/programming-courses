package archivos.OperacionesArchivo;

import java.io.File;

public class OperacionesArchivo {
    public static void main(String[] args) {

        File archivo = new File("mensaje.txt");

        // --- Información del archivo ---
        System.out.println("¿Existe?:       " + archivo.exists());
        System.out.println("Nombre:         " + archivo.getName());
        System.out.println("Ruta absoluta:  " + archivo.getAbsolutePath());
        System.out.println("Tamaño (bytes): " + archivo.length());
        System.out.println("¿Se puede leer?: " + archivo.canRead());
        System.out.println("¿Se puede escribir?: " + archivo.canWrite());

        // --- Crear un archivo nuevo ---
        File nuevoArchivo = new File("nuevo.txt");
        try {
            if (nuevoArchivo.createNewFile()) {
                System.out.println("\nArchivo 'nuevo.txt' creado.");
            } else {
                System.out.println("\n'nuevo.txt' ya existía.");
            }
        } catch (Exception e) {
            System.out.println("Error al crear: " + e.getMessage());
        }

        // --- Eliminar un archivo ---
        if (nuevoArchivo.delete()) {
            System.out.println("Archivo 'nuevo.txt' eliminado.");
        } else {
            System.out.println("No se pudo eliminar.");
        }
    }
}