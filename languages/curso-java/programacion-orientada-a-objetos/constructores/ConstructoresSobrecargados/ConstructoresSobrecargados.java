class Circulo {
    double radio;
    String color;

    // Constructor encadenado con this()
    Circulo() {
        this(1.0);  // Llama al siguiente constructor
    }

    Circulo(double radio) {
        this(radio, "rojo");  // Llama al siguiente constructor
    }

    Circulo(double radio, String color) {
        this.radio = radio;
        this.color = color;
    }

    double area() {
        return Math.PI * radio * radio;
    }

    @Override
    public String toString() {
        return String.format("Circulo[radio=%.1f, color=%s, area=%.2f]", radio, color, area());
    }
}

public class ConstructoresSobrecargados {
    public static void main(String[] args) {
        Circulo c1 = new Circulo();
        Circulo c2 = new Circulo(5.0);
        Circulo c3 = new Circulo(3.5, "azul");

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}
