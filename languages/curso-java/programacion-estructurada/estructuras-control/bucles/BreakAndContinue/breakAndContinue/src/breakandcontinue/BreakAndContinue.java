/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package breakandcontinue;

/**
 *
 * @author Dumitru
 */
public class BreakAndContinue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic hereç
//
//        // ejemplo break
//        for (int dia = 1; dia <= 7; dia++) {
//            System.out.println("Dia de la semana: "+dia);
//            
//            if(dia == 5){
//                break;
//                
//            }
//        }
//        
//        System.out.println("Bucle finalziado");
        
        
        // ejemplo continue
        for (int dia = 1; dia <= 7; dia++) {
            System.out.println("Dia de la semana: "+dia);
            
            if(dia == 5){
                continue;
        
            }
            
            System.out.println("Hola----->>: "+dia);
            
        }
        
        System.out.println("Bucle finalziado");
        
        
        
    }

}
