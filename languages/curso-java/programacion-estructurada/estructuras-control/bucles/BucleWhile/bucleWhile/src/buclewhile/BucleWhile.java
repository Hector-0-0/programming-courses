/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buclewhile;

/**
 *
 * @author Dumitru
 */
public class BucleWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int contador = 0;
        int contador2 = 0;
        
        int numero = 0;
        
        while (contador <= 10) {
            //System.out.println("Contador = " + contador);
            contador++;
            
            numero = --contador2;
            
            //System.out.println("Contador x = " + contador);

        }
        
        System.out.println("numero al final: "+numero);
        
        

    }

}
