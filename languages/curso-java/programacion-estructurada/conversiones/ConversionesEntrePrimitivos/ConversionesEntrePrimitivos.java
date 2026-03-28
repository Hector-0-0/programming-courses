public class ConversionesEntrePrimitivos {
    public static void main(String[] args) {
        // Widening (automatico, sin perdida)
        int entero = 150;
        long   largo    = entero;
        float  flotante = entero;
        double doble    = entero;
        System.out.println("int -> long:   " + largo);
        System.out.println("int -> float:  " + flotante);
        System.out.println("int -> double: " + doble);

        // Narrowing (casting manual, puede perder precision)
        double pi = 3.99999;
        int piEntero = (int) pi;
        System.out.println("double -> int (casting): " + piEntero);

        // char <-> int
        char letra = 'A';
        int codigo = letra;
        System.out.println("char 'A' -> int: " + codigo);
        char de65 = (char) 65;
        System.out.println("int 65 -> char: " + de65);
    }
}
