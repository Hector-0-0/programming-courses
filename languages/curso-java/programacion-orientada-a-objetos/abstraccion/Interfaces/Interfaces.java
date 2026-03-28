// Interface: contrato que las clases deben cumplir
interface Reproducible {
    void reproducir();
    void pausar();
    void detener();

    // Metodo default (Java 8+)
    default void reiniciar() {
        detener();
        reproducir();
    }
}

interface Descargable {
    boolean descargar(String url);
    double getProgreso();
}

interface Compartible {
    void compartir(String destino);
}

// Clase que implementa multiples interfaces
class Cancion implements Reproducible, Descargable, Compartible {
    String titulo;
    String artista;
    private boolean reproduciendose = false;
    private double  progreso        = 0;

    Cancion(String titulo, String artista) {
        this.titulo   = titulo;
        this.artista  = artista;
    }

    @Override public void reproducir() {
        reproduciendose = true;
        System.out.println("Reproduciendo: " + titulo + " - " + artista);
    }

    @Override public void pausar() {
        reproduciendose = false;
        System.out.println("Pausado: " + titulo);
    }

    @Override public void detener() {
        reproduciendose = false;
        progreso = 0;
        System.out.println("Detenido: " + titulo);
    }

    @Override public boolean descargar(String url) {
        System.out.println("Descargando de: " + url);
        progreso = 100;
        return true;
    }

    @Override public double getProgreso() { return progreso; }

    @Override public void compartir(String destino) {
        System.out.println("Compartiendo '" + titulo + "' con: " + destino);
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Cancion cancion = new Cancion("Bohemian Rhapsody", "Queen");

        cancion.descargar("https://musica.com/bohemian");
        System.out.println("Progreso: " + cancion.getProgreso() + "%");

        cancion.reproducir();
        cancion.pausar();
        cancion.compartir("Juan");
        cancion.reiniciar();  // Metodo default de la interface

        // Variable de tipo interface
        Reproducible r = cancion;
        r.reproducir();

        System.out.println("\ncancion instanceof Reproducible: " + (cancion instanceof Reproducible));
        System.out.println("cancion instanceof Descargable:  " + (cancion instanceof Descargable));
    }
}
