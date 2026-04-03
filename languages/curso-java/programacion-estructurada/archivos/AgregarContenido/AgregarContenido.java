package archivos.AgregarContenido;

import java.io.FileWriter;
import java.io.IOException;

public class AgregarContenido {
    public static void main(String[] args) {

        // El segundo parámetro 'true' activa el modo APPEND (agrega sin borrar)
        try (FileWriter escritor = new FileWriter("mensaje.txt", true)) {

            escritor.write("\nEsta línea fue agregada después.");
            escritor.write("\nY esta también, sin borrar lo anterior.");

            System.out.println("Contenido agregado exitosamente.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}