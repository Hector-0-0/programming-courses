import java.util.Scanner;

public class BucleDoWhile {
    public static void main(String[] args) {
        // Do-While siempre ejecuta al menos una vez
        System.out.println("--- Do-While ---");
        int i = 1;
        do {
            System.out.println("i = " + i);
            i++;
        } while (i <= 5);

        // Do-While para validar entrada
        System.out.println("\n--- Validacion de entrada ---");
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.print("Ingresa un numero entre 1 y 10: ");
            num = sc.nextInt();
        } while (num < 1 || num > 10);
        System.out.println("Ingresaste: " + num);
        sc.close();
    }
}
