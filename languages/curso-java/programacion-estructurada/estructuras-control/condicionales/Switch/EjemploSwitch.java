public class EjemploSwitch {
    public static void main(String[] args) {
        // Switch clasico
        int diaSemana = 3;
        switch (diaSemana) {
            case 1: System.out.println("Lunes");   break;
            case 2: System.out.println("Martes");  break;
            case 3: System.out.println("Miercoles"); break;
            case 4: System.out.println("Jueves");  break;
            case 5: System.out.println("Viernes"); break;
            case 6: System.out.println("Sabado");  break;
            case 7: System.out.println("Domingo"); break;
            default: System.out.println("Dia invalido");
        }

        // Switch con String
        String estacion = "verano";
        switch (estacion) {
            case "primavera": System.out.println("Flores y lluvia"); break;
            case "verano":    System.out.println("Calor y sol");     break;
            case "otono":     System.out.println("Hojas y viento");  break;
            case "invierno":  System.out.println("Frio y nieve");    break;
            default:          System.out.println("Estacion no valida");
        }

        // Switch expression (Java 14+)
        String dia = "MARTES";
        String tipoDia = switch (dia) {
            case "LUNES", "MARTES", "MIERCOLES", "JUEVES", "VIERNES" -> "Dia laboral";
            case "SABADO", "DOMINGO" -> "Fin de semana";
            default -> "Dia desconocido";
        };
        System.out.println(dia + ": " + tipoDia);
    }
}
