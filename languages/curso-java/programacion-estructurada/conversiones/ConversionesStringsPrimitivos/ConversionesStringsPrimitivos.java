public class ConversionesStringsPrimitivos {
    public static void main(String[] args) {
        String sInt    = "123";
        String sDouble = "3.14";
        String sBool   = "true";
        String sLong   = "9876543210";

        int     n = Integer.parseInt(sInt);
        double  d = Double.parseDouble(sDouble);
        boolean b = Boolean.parseBoolean(sBool);
        long    l = Long.parseLong(sLong);

        System.out.println("String -> int:     " + n);
        System.out.println("String -> double:  " + d);
        System.out.println("String -> boolean: " + b);
        System.out.println("String -> long:    " + l);

        try {
            int error = Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());
        }
    }
}
