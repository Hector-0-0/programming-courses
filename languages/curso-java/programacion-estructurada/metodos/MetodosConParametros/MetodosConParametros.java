public class MetodosConParametros {

    // Paso por valor (primitivos): no modifica el original
    static void intentarCambiar(int n) {
        n = 999;
        System.out.println("Dentro del metodo: " + n);
    }

    // Varargs - cantidad variable de argumentos
    static int sumarTodos(int... numeros) {
        int total = 0;
        for (int n : numeros) total += n;
        return total;
    }

    // Sobrecarga de metodos (mismo nombre, distintos parametros)
    static double area(double lado) {
        return lado * lado;
    }

    static double area(double base, double altura) {
        return base * altura;
    }

    static double area(double radio, boolean esCirculo) {
        return Math.PI * radio * radio;
    }

    public static void main(String[] args) {
        int x = 5;
        intentarCambiar(x);
        System.out.println("Despues del metodo: " + x); // Sigue siendo 5

        System.out.println("Suma varargs: " + sumarTodos(1, 2, 3, 4, 5));
        System.out.println("Suma varargs: " + sumarTodos(10, 20));

        System.out.println("Area cuadrado (4):       " + area(4));
        System.out.println("Area rectangulo (3,5):   " + area(3, 5));
        System.out.printf("Area circulo (r=7):      %.2f%n", area(7, true));
    }
}
