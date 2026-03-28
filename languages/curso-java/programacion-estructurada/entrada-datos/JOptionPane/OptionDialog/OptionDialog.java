import javax.swing.JOptionPane;

public class OptionDialog {
    public static void main(String[] args) {
        String[] opciones = {"Rojo", "Verde", "Azul"};
        int eleccion = JOptionPane.showOptionDialog(null,
            "¿Cual es tu color favorito?",
            "Seleccion de color",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null, opciones, opciones[0]);

        if (eleccion >= 0) {
            System.out.println("Elegiste: " + opciones[eleccion]);
        }
    }
}
