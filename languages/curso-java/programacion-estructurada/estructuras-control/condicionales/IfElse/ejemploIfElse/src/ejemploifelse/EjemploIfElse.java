/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemploifelse;

/**
 *
 * @author Hector
 */
public class EjemploIfElse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Ejecucion del bloque 1");
        
        int numero = 5;
        
        //---------------
        if(numero < 3 && numero > 4){
            System.out.println("Ejecucion del bloque 2");
        } else {
            System.out.println("Ejecucion del bloque 3");
        }
        
        //------------------
        
        System.out.println("Ejecucion del bloque 4");
    } 
    
}
