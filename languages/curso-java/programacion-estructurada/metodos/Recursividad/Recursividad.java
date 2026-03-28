public class Recursividad {

    static int factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }

    static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    static int potencia(int base, int exp) {
        if (exp == 0) return 1;
        return base * potencia(base, exp - 1);
    }

    static void contarAtras(int n) {
        if (n <= 0) {
            System.out.println("Despegue!");
            return;
        }
        System.out.print(n + "... ");
        contarAtras(n - 1);
    }

    public static void main(String[] args) {
        System.out.println("Factorial de 6: " + factorial(6));

        System.out.print("Fibonacci (10 terminos): ");
        for (int i = 0; i < 10; i++) System.out.print(fibonacci(i) + " ");
        System.out.println();

        System.out.println("2^10 = " + potencia(2, 10));

        System.out.print("Cuenta atras: ");
        contarAtras(5);
    }
}
