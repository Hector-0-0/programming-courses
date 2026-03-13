/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucledowhile;

/**
 *
 * @author Dumitru
 */
public class BucleDoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int contador = 0;

        int numero = 0;

        do {
            System.out.println("Contador: " + contador);
            numero = contador++;
        } while (contador <= 10);

        System.out.println("Numero al final: " + numero);
        System.out.println("Contador al final: " + contador);

    }

}
