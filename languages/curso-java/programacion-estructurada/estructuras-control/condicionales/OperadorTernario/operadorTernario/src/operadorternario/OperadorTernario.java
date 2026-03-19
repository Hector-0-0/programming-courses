/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadorternario;

/**
 *
 * @author Hector
 */
public class OperadorTernario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int x = 1;
        int y = 2;
        
        int numeroMayor = 0;
        
        numeroMayor = x > y ? x : y;
        System.out.println("El numero mayor: "+numeroMayor);
        
        
        if(x > y){
            System.out.println("El numero mayor: "+x);
        } else {
             System.out.println("El numero mayor: "+y);
        }
        
    }

}
