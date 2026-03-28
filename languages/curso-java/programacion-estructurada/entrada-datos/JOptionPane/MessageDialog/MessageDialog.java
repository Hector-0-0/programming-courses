import javax.swing.JOptionPane;

public class MessageDialog {
    public static void main(String[] args) {
        // Tipos de icono: PLAIN_MESSAGE, INFORMATION_MESSAGE, WARNING_MESSAGE, ERROR_MESSAGE, QUESTION_MESSAGE
        JOptionPane.showMessageDialog(null, "Mensaje informativo", "Titulo", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Advertencia",         "Titulo", JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null, "Error ocurrido",      "Titulo", JOptionPane.ERROR_MESSAGE);
    }
}
