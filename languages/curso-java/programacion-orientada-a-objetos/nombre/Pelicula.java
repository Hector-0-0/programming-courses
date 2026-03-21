package nombre;

public class Pelicula {
    private String titulo;
    private String director;
    private int anio;
    private int duracion;

    public Pelicula(String titulo, String director, int anio, int duracion) {
        this.titulo = titulo;
        this.director = director;
        this.anio = anio;
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "titulo='" + titulo + '\'' +
                ", director='" + director + '\'' +
                ", anio=" + anio +
                ", duracion=" + duracion +
                '}';
    }
}
