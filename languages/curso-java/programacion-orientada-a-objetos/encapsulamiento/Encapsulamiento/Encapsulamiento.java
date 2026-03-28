class CuentaBancaria {
    // Atributos privados (encapsulados)
    private String titular;
    private double saldo;
    private String numeroCuenta;

    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular      = titular;
        this.saldo        = saldoInicial;
        this.numeroCuenta = generarNumero();
    }

    private String generarNumero() {
        return "CTA-" + (int)(Math.random() * 90000 + 10000);
    }

    // Getters
    public String getTitular()     { return titular; }
    public double getSaldo()       { return saldo; }
    public String getNumeroCuenta(){ return numeroCuenta; }

    // Setter con validacion
    public void setTitular(String titular) {
        if (titular != null && !titular.isEmpty()) {
            this.titular = titular;
        }
    }

    // Metodos de negocio
    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Deposito: +" + monto + " | Saldo: " + saldo);
        } else {
            System.out.println("Monto invalido");
        }
    }

    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            System.out.println("Retiro: -" + monto + " | Saldo: " + saldo);
        } else {
            System.out.println("Fondos insuficientes o monto invalido");
        }
    }

    @Override
    public String toString() {
        return String.format("Cuenta[%s] Titular: %s | Saldo: $%.2f",
            numeroCuenta, titular, saldo);
    }
}

public class Encapsulamiento {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Ana Lopez", 1000.0);

        System.out.println(cuenta);
        System.out.println("Titular: " + cuenta.getTitular());
        System.out.println("Saldo:   " + cuenta.getSaldo());

        cuenta.depositar(500.0);
        cuenta.retirar(200.0);
        cuenta.retirar(5000.0);  // Fondos insuficientes

        // No se puede acceder directamente: cuenta.saldo = 99999; <- Error!
        System.out.println(cuenta);
    }
}
