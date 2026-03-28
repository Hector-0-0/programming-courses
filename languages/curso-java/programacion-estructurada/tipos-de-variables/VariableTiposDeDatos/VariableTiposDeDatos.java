public class VariableTiposDeDatos {
    public static void main(String[] args) {
        // Tipos enteros
        byte  numeroByte  = 100;
        short numeroShort = 30000;
        int   numeroInt   = 2_000_000;
        long  numeroLong  = 9_000_000_000L;

        // Tipos decimales
        float  decimal1 = 3.14f;
        double decimal2 = 3.141592653589793;

        // Caracter
        char letra = 'A';

        // Booleano
        boolean esVerdadero = true;
        boolean esFalso     = false;

        // Cadena de texto (no primitivo)
        String texto = "Hola Java";

        System.out.println("byte:    " + numeroByte);
        System.out.println("short:   " + numeroShort);
        System.out.println("int:     " + numeroInt);
        System.out.println("long:    " + numeroLong);
        System.out.println("float:   " + decimal1);
        System.out.println("double:  " + decimal2);
        System.out.println("char:    " + letra);
        System.out.println("boolean: " + esVerdadero + " / " + esFalso);
        System.out.println("String:  " + texto);

        // Inferencia de tipo (Java 10+)
        var numero = 42;
        var mensaje = "Inferencia de tipo con var";
        System.out.println(numero + " - " + mensaje);
    }
}
