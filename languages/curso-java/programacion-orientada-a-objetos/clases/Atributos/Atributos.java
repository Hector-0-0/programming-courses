public class Atributos {

    // Atributos de instancia
    String nombre;
    int edad;

    // Atributo de clase (compartido por todos)
    static int totalPersonas = 0;

    // Constante
    static final String ESPECIE = "Homo sapiens";

    // Atributo con valor por defecto
    boolean activo = true;

    public static void main(String[] args) {
        Atributos p1 = new Atributos();
        p1.nombre = "Ana";
        p1.edad   = 25;
        Atributos.totalPersonas++;

        Atributos p2 = new Atributos();
        p2.nombre = "Carlos";
        p2.edad   = 30;
        Atributos.totalPersonas++;

        System.out.println(p1.nombre + ", " + p1.edad + " - Activo: " + p1.activo);
        System.out.println(p2.nombre + ", " + p2.edad + " - Activo: " + p2.activo);
        System.out.println("Total personas: " + Atributos.totalPersonas);
        System.out.println("Especie: " + ESPECIE);

        // Tipos de datos por defecto en atributos
        Atributos obj = new Atributos();
        System.out.println("\nValores por defecto:");
        System.out.println("String:  " + obj.nombre);   // null
        System.out.println("int:     " + obj.edad);     // 0
        System.out.println("boolean: " + obj.activo);   // true (asignado)
    }
}
