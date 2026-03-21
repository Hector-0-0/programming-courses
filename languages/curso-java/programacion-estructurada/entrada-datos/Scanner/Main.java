import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //declaracion de variables
        Scanner lector = new Scanner(System.in);

        //leemos por teclado un String
//        System.out.println("Introduce un color: ");
//        String color = lector.nextLine();
//        System.out.println("El color es: " + color);
        
        //leemos un numero por teclado
//        System.out.println("Introduce un numero: ");
//        int numero = lector.nextInt();
//        System.out.println("EL numero introducido es: "+numero);
        
        //leemos un numero por teclado, pero hacemos conversion
        System.out.println("Introduce un numero: ");
        String numeroTexto = lector.nextLine();
        int numero = Integer.parseInt(numeroTexto);
        System.out.println("EL numero introducido es: "+numero);
        
    }

}
