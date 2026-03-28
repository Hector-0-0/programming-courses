// Clase abstracta: no se puede instanciar directamente
abstract class Dispositivo {
    String marca;
    String modelo;
    boolean encendido;

    Dispositivo(String marca, String modelo) {
        this.marca    = marca;
        this.modelo   = modelo;
        this.encendido = false;
    }

    // Metodos abstractos (sin implementacion)
    abstract void encender();
    abstract void apagar();
    abstract String getInfo();

    // Metodos concretos (con implementacion)
    boolean estaEncendido() {
        return encendido;
    }

    void mostrarEstado() {
        System.out.println(getInfo() + " | Estado: " + (encendido ? "ENCENDIDO" : "APAGADO"));
    }
}

class Televisor extends Dispositivo {
    int    canal;
    int    volumen;

    Televisor(String marca, String modelo) {
        super(marca, modelo);
        canal   = 1;
        volumen = 10;
    }

    @Override void encender() {
        encendido = true;
        System.out.println(marca + " " + modelo + " encendido. Canal: " + canal);
    }

    @Override void apagar() {
        encendido = false;
        System.out.println(marca + " " + modelo + " apagado.");
    }

    @Override String getInfo() {
        return "Televisor[" + marca + " " + modelo + "]";
    }

    void cambiarCanal(int canal) {
        this.canal = canal;
        System.out.println("Canal cambiado a " + canal);
    }
}

class Computadora extends Dispositivo {
    String sistemaOperativo;

    Computadora(String marca, String modelo, String so) {
        super(marca, modelo);
        this.sistemaOperativo = so;
    }

    @Override void encender() {
        encendido = true;
        System.out.println("Iniciando " + sistemaOperativo + " en " + marca + " " + modelo);
    }

    @Override void apagar() {
        encendido = false;
        System.out.println("Apagando " + sistemaOperativo + "...");
    }

    @Override String getInfo() {
        return "Computadora[" + marca + " " + modelo + " | " + sistemaOperativo + "]";
    }
}

public class ClasesAbstractas {
    public static void main(String[] args) {
        // Dispositivo d = new Dispositivo("", ""); // ERROR: no se puede instanciar

        Televisor    tv  = new Televisor("Samsung", "QLED 55");
        Computadora  pc  = new Computadora("Dell", "XPS 15", "Windows 11");

        tv.encender();
        tv.cambiarCanal(5);
        tv.mostrarEstado();

        System.out.println();

        pc.encender();
        pc.mostrarEstado();
        pc.apagar();
        pc.mostrarEstado();

        // Polimorfismo con abstraccion
        System.out.println("\n--- Polimorfismo ---");
        Dispositivo[] dispositivos = {tv, pc};
        for (Dispositivo d : dispositivos) {
            d.mostrarEstado();
        }
    }
}
