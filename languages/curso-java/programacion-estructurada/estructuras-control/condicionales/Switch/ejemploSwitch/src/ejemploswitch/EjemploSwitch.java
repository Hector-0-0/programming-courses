/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemploswitch;

/**
 *
 * @author Hector
 */
public class EjemploSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Ejecucion del bloque 1");
        
        int numero = 1;
        
        //------------
        switch (numero) {
            
            case 1: System.out.println("Ejecucion del bloque valor 1");
            break;
            
            case 2: System.out.println("Ejecucion del bloque valor 2");
            break;
            
            case 3: System.out.println("Ejecucion del bloque valor 3");
            break;
            
            default: System.out.println("Ejecucion del bloque default");
            break;
        }
        
        //--------------
        
        
        
        
        if(numero == 1){
            System.out.println("Ejecucion del bloque valor 1");
        } else if  (numero == 2){
            System.out.println("Ejecucion del bloque valor 2");
        } else if  (numero == 3){
            System.out.println("Ejecucion del bloque valor 3");
        } else {
            System.out.println("Ejecucion del bloque default");
        }
        
        System.out.println("Ejecucion del bloque 2");
    }
    
    
    
    
}
