public class BucleWhile {
    public static void main(String[] args) {
        // While basico
        int contador = 1;
        System.out.println("--- While ---");
        while (contador <= 5) {
            System.out.println("Contador: " + contador);
            contador++;
        }

        // While con condicion compleja
        System.out.println("\n--- While con suma acumulada ---");
        int suma = 0, numero = 1;
        while (suma < 15) {
            suma += numero;
            System.out.println("Suma hasta " + numero + " = " + suma);
            numero++;
        }
    }
}
