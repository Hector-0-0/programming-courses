public class BucleDoWhile {
    public static void main(String[] args) {
        // TODO code application logic here

        int contador = 0;

        int numero = 0;

        do {
            System.out.println("Contador: " + contador);
            numero = contador++;
        } while (contador <= 10);

        System.out.println("Numero al final: " + numero);
        System.out.println("Contador al final: " + contador);

    }

}
