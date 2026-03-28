import javax.swing.JOptionPane;

public class ConfirmDialog {
    public static void main(String[] args) {
        int respuesta = JOptionPane.showConfirmDialog(null,
            "¿Deseas continuar?", "Confirmacion",
            JOptionPane.YES_NO_CANCEL_OPTION);

        if (respuesta == JOptionPane.YES_OPTION) {
            System.out.println("El usuario eligio SI");
        } else if (respuesta == JOptionPane.NO_OPTION) {
            System.out.println("El usuario eligio NO");
        } else {
            System.out.println("El usuario cancelo");
        }
    }
}
