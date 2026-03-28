class Producto {
    String nombre;
    double precio;
    int stock;

    void describir() {
        System.out.println("Producto: " + nombre + " | Precio: $" + precio + " | Stock: " + stock);
    }

    boolean hayStock() {
        return stock > 0;
    }

    void vender(int cantidad) {
        if (cantidad <= stock) {
            stock -= cantidad;
            System.out.println("Vendidos " + cantidad + " de " + nombre);
        } else {
            System.out.println("Stock insuficiente");
        }
    }
}

public class Objetos {
    public static void main(String[] args) {
        Producto p1 = new Producto();
        p1.nombre = "Laptop";
        p1.precio = 1200.00;
        p1.stock  = 10;

        Producto p2 = new Producto();
        p2.nombre = "Mouse";
        p2.precio = 25.99;
        p2.stock  = 0;

        p1.describir();
        p2.describir();

        p1.vender(3);
        p1.describir();

        System.out.println("Hay stock de Mouse: " + p2.hayStock());

        // Referencia nula
        Producto p3 = null;
        System.out.println("p3 es null: " + (p3 == null));

        // Copiar referencia vs copiar objeto
        Producto p4 = p1;  // Misma referencia
        p4.precio = 999.99;
        System.out.println("Precio p1: " + p1.precio); // Tambien cambio!
    }
}
