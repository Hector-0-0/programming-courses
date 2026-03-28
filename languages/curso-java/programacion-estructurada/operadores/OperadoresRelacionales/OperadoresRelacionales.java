public class OperadoresRelacionales {
    public static void main(String[] args) {
        int a = 10, b = 20;
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a >  b: " + (a >  b));
        System.out.println("a <  b: " + (a <  b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
        String s1 = "Hola", s2 = "Hola";
        System.out.println("s1.equals(s2): " + s1.equals(s2));
        System.out.println("equalsIgnoreCase: " + s1.equalsIgnoreCase("hola"));
    }
}
