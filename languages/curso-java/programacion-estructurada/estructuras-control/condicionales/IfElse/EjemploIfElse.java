public class EjemploIfElse {
    public static void main(String[] args) {
        int numero = 7;

        if (numero % 2 == 0) {
            System.out.println(numero + " es par");
        } else {
            System.out.println(numero + " es impar");
        }

        double temperatura = 36.5;
        if (temperatura > 37.5) {
            System.out.println("Tiene fiebre");
        } else {
            System.out.println("Temperatura normal");
        }
    }
}
