package archivos.LeerArchivo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerArchivo {
    public static void main(String[] args) {

        // BufferedReader lee el archivo línea por línea eficientemente
        try (BufferedReader lector = new BufferedReader(new FileReader("mensaje.txt"))) {

            String linea;
            int numeroLinea = 1;

            while ((linea = lector.readLine()) != null) {
                System.out.println("Línea " + numeroLinea + ": " + linea);
                numeroLinea++;
            }

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}