package archivos.EscribirArchivo;

import java.io.FileWriter;
import java.io.IOException;

public class EscribirArchivo {
    public static void main(String[] args) {

        // FileWriter crea el archivo si no existe, y lo sobreescribe si ya existe
        try (FileWriter escritor = new FileWriter("mensaje.txt")) {

            escritor.write("Hola, esto es una línea.\n");
            escritor.write("Esto es otra línea.\n");
            escritor.write("Java puede escribir archivos fácilmente.");

            System.out.println("Archivo escrito exitosamente.");

        } catch (IOException e) {
            System.out.println("Error al escribir el archivo: " + e.getMessage());
        }
    }
}