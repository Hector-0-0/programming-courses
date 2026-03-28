public class OperadoresAritmeticosIncrementalesDecrementales {
    public static void main(String[] args) {
        int a = 5;

        System.out.println("Valor inicial: " + a);
        System.out.println("Post-incremento (a++): " + a++);  // Muestra 5, luego a=6
        System.out.println("Después del post-incremento: " + a);

        System.out.println("Pre-incremento (++a): " + ++a);   // a=7, muestra 7

        System.out.println("Post-decremento (a--): " + a--);  // Muestra 7, luego a=6
        System.out.println("Pre-decremento (--a): " + --a);   // a=5, muestra 5
    }
}
