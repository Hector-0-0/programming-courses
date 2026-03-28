public class OperadorTernario {
    public static void main(String[] args) {
        // condicion ? valorSiVerdadero : valorSiFalso
        int a = 10, b = 20;
        int mayor = (a > b) ? a : b;
        System.out.println("El mayor es: " + mayor);

        int edad = 20;
        String acceso = (edad >= 18) ? "Permitido" : "Denegado";
        System.out.println("Acceso: " + acceso);

        // Ternario anidado
        int n = 0;
        String signo = (n > 0) ? "positivo" : (n < 0) ? "negativo" : "cero";
        System.out.println("El numero es " + signo);
    }
}
