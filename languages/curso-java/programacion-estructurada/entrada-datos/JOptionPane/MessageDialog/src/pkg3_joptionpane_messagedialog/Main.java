/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3_joptionpane_messagedialog;

import javax.swing.JOptionPane;


/**
 *
 * @author Dumitru
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //pedimos datos por teclado
        String numeroTexto = JOptionPane.showInputDialog("Introduce un texto: ");
        int numero = Integer.parseInt(numeroTexto);
        
        JOptionPane.showMessageDialog(null, "El numero es: "+numero, "El numero que has introducido es:", 2);
    }
    
}
