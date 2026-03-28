abstract class Figura {
    String color;

    Figura(String color) {
        this.color = color;
    }

    abstract double area();
    abstract double perimetro();

    void describir() {
        System.out.printf("Color: %-8s | Area: %8.2f | Perimetro: %8.2f%n",
            color, area(), perimetro());
    }
}

class Rectangulo extends Figura {
    double ancho, alto;

    Rectangulo(String color, double ancho, double alto) {
        super(color);
        this.ancho = ancho;
        this.alto  = alto;
    }

    @Override double area()      { return ancho * alto; }
    @Override double perimetro() { return 2 * (ancho + alto); }
}

class Circulo extends Figura {
    double radio;

    Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }

    @Override double area()      { return Math.PI * radio * radio; }
    @Override double perimetro() { return 2 * Math.PI * radio; }
}

class Triangulo extends Figura {
    double a, b, c;

    Triangulo(String color, double a, double b, double c) {
        super(color);
        this.a = a; this.b = b; this.c = c;
    }

    @Override double area() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s-a) * (s-b) * (s-c));
    }
    @Override double perimetro() { return a + b + c; }
}

public class Polimorfismo {
    public static void main(String[] args) {
        // Array polimorfico
        Figura[] figuras = {
            new Rectangulo("Rojo",   5, 3),
            new Circulo   ("Azul",   4),
            new Triangulo ("Verde",  3, 4, 5),
            new Rectangulo("Amarillo", 8, 2),
        };

        System.out.println("=== Figuras ===");
        for (Figura f : figuras) {
            System.out.print(f.getClass().getSimpleName() + " -> ");
            f.describir();   // Cada clase llama SU implementacion
        }

        // Suma total de areas
        double totalArea = 0;
        for (Figura f : figuras) totalArea += f.area();
        System.out.printf("Area total: %.2f%n", totalArea);
    }
}
