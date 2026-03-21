import java.util.Scanner;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        
        try (Scanner lector = new Scanner(System.in)) {
            System.out.println("Introduce un numero: ");
            int num1 = lector.nextInt();
            System.out.println("Introduce otro numero: ");
            int num2 = lector.nextInt();
            int suma = num1 + num2;
        System.out.println("La suma de " + num1 + " y " + num2 + " es: " + suma);
        System.out.println("La resta de " + num1 + " y " + num2 + " es: " + (num1 - num2));
        System.out.println("La multiplicacion de " + num1 + " y " + num2 + " es: " + (num1 * num2));
        System.out.println("La division de " + num1 + " y " + num2 + " es: " + (num1 / num2));
        System.out.println("El resto de " + num1 + " y " + num2 + " es: " + (num1 % num2));
        }
        
        int num3 = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero: "));
        int num4 = Integer.parseInt(JOptionPane.showInputDialog("Introduce otro numero: "));
        JOptionPane.showMessageDialog(null, "La suma de " + num3 + " y " + num4 + " es: " + (num3 + num4));
        JOptionPane.showMessageDialog(null, "La resta de " + num3 + " y " + num4 + " es: " + (num3 - num4));
        JOptionPane.showMessageDialog(null, "La multiplicacion de " + num3 + " y " + num4 + " es: " + (num3 * num4));
        JOptionPane.showMessageDialog(null, "La division de " + num3 + " y " + num4 + " es: " + (num3 / num4));
        JOptionPane.showMessageDialog(null, "El resto de " + num3 + " y " + num4 + " es: " + (num3 % num4));
    }

}