/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg4_joptionpane_confirmdialog;

import javax.swing.JOptionPane;

/**
 *
 * @author Hector
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int opcion = JOptionPane.showConfirmDialog(null, "Elige un opcion", "Opciones disponibles", 1, 0);

        System.out.println(opcion);

        if (opcion == 0) {
            System.out.println("Has elegido la opcion YES");
        } else if (opcion == 1) {
            System.out.println("Has elegido la opcion NO");
        } else if (opcion == 2) {
            System.out.println("Has elegido la opcion CANCEL");
        }
    }

}
