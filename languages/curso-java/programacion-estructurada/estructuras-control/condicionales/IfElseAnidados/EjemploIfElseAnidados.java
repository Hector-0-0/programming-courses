public class EjemploIfElseAnidados {
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("Ejecucion del bloque 1");

        int numero = 1;

        //---------------------
        if (numero == 1) {
            System.out.println("Ejecucion del bloque 2");
        } else if (numero == 2) {
            System.out.println("Ejecucion del bloque 3");
        } else if (numero == 3) {
            System.out.println("Ejecucion del bloque 4");
        } else if (numero == 4) {
            System.out.println("Ejecucion del bloque 5");
        } else {
            System.out.println("Ejecucion del bloque 6");
        }
        //------------------
        
        System.out.println("Ejecucion del bloque 7");

        System.out.println("Ejecucion del bloque 1");
        if (numero == 1) {
            System.out.println("Ejecucion del bloque 2");
        }

        if (numero == 2) {
            System.out.println("Ejecucion del bloque 3");
        }

        if (numero == 3) {
            System.out.println("Ejecucion del bloque 4");
        }

        if (numero == 4) {
            System.out.println("Ejecucion del bloque 5");
        } else {
            System.out.println("Ejecucion del bloque 6");
        }
        System.out.println("Ejecucion del bloque 7");

    }

}
