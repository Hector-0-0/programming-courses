public class OperadoresAritmeticosBasicos {
    public static void main(String[] args) {
        int a = 20, b = 7;

        System.out.println("a = " + a + ", b = " + b);
        System.out.println("Suma:        " + (a + b));
        System.out.println("Resta:       " + (a - b));
        System.out.println("Multiplicación: " + (a * b));
        System.out.println("División:    " + (a / b));       // División entera
        System.out.println("Módulo:      " + (a % b));       // Resto

        // División real
        double x = 20.0, y = 7.0;
        System.out.println("División real: " + (x / y));
    }
}
