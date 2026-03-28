import java.util.Scanner;

public class Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();

        System.out.print("Ingresa tu altura (ej: 1.75): ");
        double altura = scanner.nextDouble();

        System.out.println("\n--- Datos ingresados ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad:   " + edad);
        System.out.println("Altura: " + altura + " m");

        scanner.close();
    }
}
