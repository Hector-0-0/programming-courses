class Ser {
    void respirar() {
        System.out.println("Respirando...");
    }
}

class Animal extends Ser {
    String nombre;

    Animal(String nombre) {
        this.nombre = nombre;
    }

    void moverse() {
        System.out.println(nombre + " se mueve");
    }
}

class Mamifero extends Animal {
    String pelaje;

    Mamifero(String nombre, String pelaje) {
        super(nombre);
        this.pelaje = pelaje;
    }

    void amamantar() {
        System.out.println(nombre + " amamanta a sus crias");
    }
}

class Perro extends Mamifero {
    String raza;

    Perro(String nombre, String raza) {
        super(nombre, "corto");
        this.raza = raza;
    }

    void ladrar() {
        System.out.println(nombre + " ladra: Guau!");
    }
}

public class HerenciaMultinivel {
    public static void main(String[] args) {
        Perro perro = new Perro("Toby", "Beagle");

        // Hereda de todos los niveles
        perro.respirar();    // De Ser
        perro.moverse();     // De Animal
        perro.amamantar();   // De Mamifero
        perro.ladrar();      // Propio

        System.out.println("Raza: " + perro.raza + " | Pelaje: " + perro.pelaje);
    }
}
