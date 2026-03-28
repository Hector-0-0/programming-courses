class Contador {
    // Variable estatica: compartida por TODAS las instancias
    private static int totalInstancias = 0;

    // Constante estatica
    public static final int MAX_INSTANCIAS = 5;

    private int id;
    private String nombre;

    Contador(String nombre) {
        totalInstancias++;
        this.id     = totalInstancias;
        this.nombre = nombre;
    }

    // Metodo estatico: NO puede acceder a atributos de instancia
    public static int getTotalInstancias() {
        return totalInstancias;
    }

    public static void resetear() {
        totalInstancias = 0;
        System.out.println("Contador reseteado");
    }

    @Override
    public String toString() {
        return "Objeto[id=" + id + ", nombre=" + nombre + "]";
    }
}

// Clase utilitaria con solo metodos estaticos
class MathUtil {
    // Constructor privado: no se puede instanciar
    private MathUtil() {}

    public static int maximo(int a, int b)       { return (a > b) ? a : b; }
    public static int minimo(int a, int b)       { return (a < b) ? a : b; }
    public static boolean esPar(int n)           { return n % 2 == 0; }
    public static int potencia(int base, int exp){
        int result = 1;
        for (int i = 0; i < exp; i++) result *= base;
        return result;
    }
}

public class MiembrosEstaticos {
    public static void main(String[] args) {
        System.out.println("Total inicial: " + Contador.getTotalInstancias());

        Contador c1 = new Contador("Alpha");
        Contador c2 = new Contador("Beta");
        Contador c3 = new Contador("Gamma");

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println("Total: " + Contador.getTotalInstancias());
        System.out.println("MAX:   " + Contador.MAX_INSTANCIAS);

        Contador.resetear();
        System.out.println("Total tras reset: " + Contador.getTotalInstancias());

        System.out.println("\n--- MathUtil ---");
        System.out.println("Maximo(8,13):   " + MathUtil.maximo(8, 13));
        System.out.println("Minimo(8,13):   " + MathUtil.minimo(8, 13));
        System.out.println("EsPar(6):       " + MathUtil.esPar(6));
        System.out.println("Potencia(2,10): " + MathUtil.potencia(2, 10));
    }
}
