/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5_joptionpane_optiondialog;

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
        int opcion = JOptionPane.showOptionDialog(null, "Elige una opcion",
                "Opciones personalizadas",
                0,
                1,
                null,
                new Object[]{"opcion1 ", "opcion2", "opcion3", "opcion4"},
                "opcion1");

        if (opcion == 0) {
            System.out.println("Has elegido la opcion 1");
        } else if (opcion == 1) {
            System.out.println("Has elegido la opcion 2");
        } else if (opcion == 2) {
            System.out.println("Has elegido la opcion 3");
        } else if (opcion == 3) {
            System.out.println("Has elegido la opcion 4");
        }
    }

}
