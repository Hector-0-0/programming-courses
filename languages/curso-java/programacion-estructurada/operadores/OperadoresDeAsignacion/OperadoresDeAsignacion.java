public class OperadoresDeAsignacion {
    public static void main(String[] args) {
        int x = 10;
        System.out.println("Asignación simple (x = 10): " + x);

        x += 5;   System.out.println("x += 5  → " + x);
        x -= 2;   System.out.println("x -= 2  → " + x);
        x *= 3;   System.out.println("x *= 3  → " + x);
        x /= 2;   System.out.println("x /= 2  → " + x);
        x %= 4;   System.out.println("x %= 4  → " + x);

        // Asignación con operadores bit a bit
        x &= 3;   System.out.println("x &= 3  → " + x);
        x |= 8;   System.out.println("x |= 8  → " + x);
        x ^= 5;   System.out.println("x ^= 5  → " + x);
    }
}
