class Empleado {
    String nombre;
    double salarioBase;

    Empleado(String nombre, double salarioBase) {
        this.nombre      = nombre;
        this.salarioBase = salarioBase;
    }

    double calcularSalario() {
        return salarioBase;
    }

    void mostrar() {
        System.out.printf("%-15s | Tipo: %-15s | Salario: $%.2f%n",
            nombre, getClass().getSimpleName(), calcularSalario());
    }
}

class EmpleadoTiempoCompleto extends Empleado {
    double bonificacion;

    EmpleadoTiempoCompleto(String nombre, double salarioBase, double bonificacion) {
        super(nombre, salarioBase);
        this.bonificacion = bonificacion;
    }

    @Override
    double calcularSalario() {
        return super.calcularSalario() + bonificacion;
    }
}

class EmpleadoPorHoras extends Empleado {
    int    horasTrabajadas;
    double tarifaHora;

    EmpleadoPorHoras(String nombre, int horas, double tarifa) {
        super(nombre, 0);
        this.horasTrabajadas = horas;
        this.tarifaHora      = tarifa;
    }

    @Override
    double calcularSalario() {
        return horasTrabajadas * tarifaHora;
    }
}

class Gerente extends EmpleadoTiempoCompleto {
    double comision;

    Gerente(String nombre, double salario, double bono, double comision) {
        super(nombre, salario, bono);
        this.comision = comision;
    }

    @Override
    double calcularSalario() {
        return super.calcularSalario() + comision;
    }
}

public class SobreescrituraMetodos {
    public static void main(String[] args) {
        Empleado[] equipo = {
            new EmpleadoTiempoCompleto("Maria",   3000, 500),
            new EmpleadoPorHoras      ("Carlos",  120,  15.5),
            new Gerente               ("Sofia",   5000, 1000, 2000),
        };

        for (Empleado e : equipo) e.mostrar();

        double totalNomina = 0;
        for (Empleado e : equipo) totalNomina += e.calcularSalario();
        System.out.printf("Nomina total: $%.2f%n", totalNomina);
    }
}
