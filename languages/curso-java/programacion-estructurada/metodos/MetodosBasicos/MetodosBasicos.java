public class MetodosBasicos {

    // Metodo sin parametros ni retorno
    static void saludar() {
        System.out.println("Hola desde un metodo!");
    }

    // Metodo con parametro
    static void saludarA(String nombre) {
        System.out.println("Hola, " + nombre + "!");
    }

    // Metodo con retorno
    static int sumar(int a, int b) {
        return a + b;
    }

    // Metodo con multiples parametros
    static double calcularPromedio(double[] notas) {
        double suma = 0;
        for (double n : notas) suma += n;
        return suma / notas.length;
    }

    public static void main(String[] args) {
        saludar();
        saludarA("Carlos");

        int resultado = sumar(8, 12);
        System.out.println("8 + 12 = " + resultado);

        double[] notas = {85, 90, 78, 92, 88};
        System.out.printf("Promedio: %.2f%n", calcularPromedio(notas));
    }
}
