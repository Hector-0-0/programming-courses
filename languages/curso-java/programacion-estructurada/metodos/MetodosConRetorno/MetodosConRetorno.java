public class MetodosConRetorno {

    static boolean esPrimo(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    static String clasificarEdad(int edad) {
        if (edad < 13)       return "Nino";
        else if (edad < 18)  return "Adolescente";
        else if (edad < 65)  return "Adulto";
        else                 return "Adulto mayor";
    }

    static int factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);  // Recursion
    }

    static int[] minMax(int[] arr) {
        int min = arr[0], max = arr[0];
        for (int n : arr) {
            if (n < min) min = n;
            if (n > max) max = n;
        }
        return new int[]{min, max};
    }

    public static void main(String[] args) {
        System.out.println("7 es primo: " + esPrimo(7));
        System.out.println("10 es primo: " + esPrimo(10));

        System.out.println("Edad 10: " + clasificarEdad(10));
        System.out.println("Edad 25: " + clasificarEdad(25));
        System.out.println("Edad 70: " + clasificarEdad(70));

        System.out.println("5! = " + factorial(5));

        int[] nums = {4, 1, 9, 2, 7};
        int[] resultado = minMax(nums);
        System.out.println("Min: " + resultado[0] + ", Max: " + resultado[1]);
    }
}
