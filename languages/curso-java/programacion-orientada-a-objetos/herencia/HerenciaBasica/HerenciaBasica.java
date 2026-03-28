// Clase padre (superclase)
class Animal {
    String nombre;
    String sonido;
    int    edad;

    Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad   = edad;
    }

    void comer() {
        System.out.println(nombre + " esta comiendo");
    }

    void dormir() {
        System.out.println(nombre + " esta durmiendo");
    }

    void hacerSonido() {
        System.out.println(nombre + " hace: " + sonido);
    }

    @Override
    public String toString() {
        return "Animal[" + nombre + ", " + edad + " anos]";
    }
}

// Clase hija (subclase)
class Perro extends Animal {
    String raza;

    Perro(String nombre, int edad, String raza) {
        super(nombre, edad);   // Llama al constructor del padre
        this.raza   = raza;
        this.sonido = "Guau";
    }

    void buscarPelota() {
        System.out.println(nombre + " busca la pelota");
    }

    @Override
    public String toString() {
        return "Perro[" + nombre + ", " + raza + "]";
    }
}

class Gato extends Animal {
    boolean esIndoor;

    Gato(String nombre, int edad, boolean esIndoor) {
        super(nombre, edad);
        this.esIndoor = esIndoor;
        this.sonido   = "Miau";
    }

    void ronronear() {
        System.out.println(nombre + " esta ronroneando");
    }
}

public class HerenciaBasica {
    public static void main(String[] args) {
        Perro perro = new Perro("Rex", 3, "Labrador");
        Gato  gato  = new Gato("Whiskers", 2, true);

        perro.comer();
        perro.hacerSonido();
        perro.buscarPelota();
        System.out.println(perro);

        System.out.println();

        gato.dormir();
        gato.hacerSonido();
        gato.ronronear();

        // instanceof
        System.out.println("\nperro instanceof Animal: " + (perro instanceof Animal));
        System.out.println("gato  instanceof Perro:  " + (gato  instanceof Perro));
    }
}
