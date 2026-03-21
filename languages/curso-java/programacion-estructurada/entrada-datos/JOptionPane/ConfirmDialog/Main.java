import javax.swing.JOptionPane;

public class Main {
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
