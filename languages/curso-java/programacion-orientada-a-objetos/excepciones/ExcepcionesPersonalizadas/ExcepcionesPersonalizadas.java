// Excepcion personalizada (unchecked)
class SaldoInsuficienteException extends RuntimeException {
    private double saldoActual;
    private double montoSolicitado;

    SaldoInsuficienteException(double saldoActual, double montoSolicitado) {
        super(String.format("Saldo insuficiente. Disponible: $%.2f | Solicitado: $%.2f",
            saldoActual, montoSolicitado));
        this.saldoActual     = saldoActual;
        this.montoSolicitado = montoSolicitado;
    }

    double getSaldoActual()    { return saldoActual; }
    double getMontoSolicitado(){ return montoSolicitado; }
}

// Excepcion personalizada (checked)
class EdadInvalidaException extends Exception {
    EdadInvalidaException(int edad) {
        super("Edad invalida: " + edad + ". Debe estar entre 0 y 120.");
    }
}

class Banco {
    private double saldo;

    Banco(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    void retirar(double monto) {
        if (monto > saldo) {
            throw new SaldoInsuficienteException(saldo, monto);
        }
        saldo -= monto;
        System.out.println("Retiro exitoso: $" + monto + " | Saldo: $" + saldo);
    }
}

class Persona {
    String nombre;
    int    edad;

    Persona(String nombre, int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException(edad);
        }
        this.nombre = nombre;
        this.edad   = edad;
    }
}

public class ExcepcionesPersonalizadas {
    public static void main(String[] args) {
        // Excepcion unchecked
        Banco banco = new Banco(500.0);
        try {
            banco.retirar(200.0);
            banco.retirar(400.0);   // Lanza SaldoInsuficienteException
        } catch (SaldoInsuficienteException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.printf("Diferencia: $%.2f%n", e.getMontoSolicitado() - e.getSaldoActual());
        }

        // Excepcion checked
        System.out.println();
        try {
            Persona p1 = new Persona("Ana", 25);
            System.out.println("Persona creada: " + p1.nombre + ", " + p1.edad);

            Persona p2 = new Persona("Carlos", -5);  // Lanza EdadInvalidaException
        } catch (EdadInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
