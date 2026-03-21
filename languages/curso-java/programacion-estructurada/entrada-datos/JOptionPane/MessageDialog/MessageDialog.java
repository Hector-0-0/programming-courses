import javax.swing.JOptionPane;

public class MessageDialog {
    public static void main(String[] args) {
        //pedimos datos por teclado
        String numeroTexto = JOptionPane.showInputDialog("Introduce un texto: ");
        int numero = Integer.parseInt(numeroTexto);
        
        JOptionPane.showMessageDialog(null, "El numero es: "+numero, "El numero que has introducido es:", 2);
    }
    
}
