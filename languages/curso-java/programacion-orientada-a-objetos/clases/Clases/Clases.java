// Clase basica en Java
class Vehiculo {
    // Atributos (campos)
    String marca;
    String modelo;
    int anio;
    double precio;

    // Metodo
    void mostrarInfo() {
        System.out.println(marca + " " + modelo + " (" + anio + ") - $" + precio);
    }

    boolean esReciente() {
        return anio >= 2020;
    }
}

public class Clases {
    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo();
        v1.marca  = "Toyota";
        v1.modelo = "Corolla";
        v1.anio   = 2022;
        v1.precio = 25000.00;

        Vehiculo v2 = new Vehiculo();
        v2.marca  = "Ford";
        v2.modelo = "Fiesta";
        v2.anio   = 2018;
        v2.precio = 15000.00;

        v1.mostrarInfo();
        v2.mostrarInfo();

        System.out.println("Toyota es reciente: " + v1.esReciente());
        System.out.println("Ford es reciente:   " + v2.esReciente());
    }
}
