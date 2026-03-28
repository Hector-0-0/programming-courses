public class EjemploIfElseAnidados {
    public static void main(String[] args) {
        int nota = 75;
        String calificacion;

        if (nota >= 90) {
            calificacion = "Sobresaliente";
        } else if (nota >= 80) {
            calificacion = "Notable";
        } else if (nota >= 70) {
            calificacion = "Bien";
        } else if (nota >= 60) {
            calificacion = "Aprobado";
        } else {
            calificacion = "Reprobado";
        }

        System.out.println("Nota " + nota + ": " + calificacion);
    }
}
