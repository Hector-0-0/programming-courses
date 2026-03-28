class Persona {
    String nombre;
    int    edad;
    String ciudad;

    // Constructor por defecto (sin parametros)
    Persona() {
        nombre = "Sin nombre";
        edad   = 0;
        ciudad = "Desconocida";
        System.out.println("Constructor por defecto ejecutado");
    }

    // Constructor con parametros
    Persona(String nombre, int edad) {
        this.nombre = nombre;    // 'this' diferencia atributo del parametro
        this.edad   = edad;
        this.ciudad = "Desconocida";
        System.out.println("Constructor 2 parametros ejecutado");
    }

    // Constructor completo
    Persona(String nombre, int edad, String ciudad) {
        this.nombre = nombre;
        this.edad   = edad;
        this.ciudad = ciudad;
        System.out.println("Constructor completo ejecutado");
    }

    void mostrar() {
        System.out.println(nombre + " | " + edad + " anos | " + ciudad);
    }
}

public class ConstructoresBasicos {
    public static void main(String[] args) {
        Persona p1 = new Persona();
        Persona p2 = new Persona("Maria", 28);
        Persona p3 = new Persona("Juan", 35, "Lima");

        p1.mostrar();
        p2.mostrar();
        p3.mostrar();
    }
}
