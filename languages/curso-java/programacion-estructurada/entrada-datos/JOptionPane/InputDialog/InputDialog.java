import javax.swing.JOptionPane;

public class InputDialog {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("¿Cual es tu nombre?");
        String edadStr = JOptionPane.showInputDialog("¿Cuantos anos tienes?");
        int edad = Integer.parseInt(edadStr);

        JOptionPane.showMessageDialog(null,
            "Hola, " + nombre + "!\nTienes " + edad + " anos.");
    }
}
