public class ConversionesPrimitivosStrings {
    public static void main(String[] args) {
        int     n = 42;
        double  d = 3.14;
        boolean b = true;

        String s1 = String.valueOf(n);
        String s2 = String.valueOf(d);
        String s3 = String.valueOf(b);
        String s4 = Integer.toString(n);
        String s5 = "" + n;

        System.out.println("int    -> String: " + s1);
        System.out.println("double -> String: " + s2);
        System.out.println("boolean-> String: " + s3);
        System.out.println("Integer.toString: " + s4);
        System.out.println("Concatenacion:    " + s5);
    }
}
