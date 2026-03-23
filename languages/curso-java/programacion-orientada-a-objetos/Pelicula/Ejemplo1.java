class Ejemplo {
    static void metodoEstatico() {
        System.out.println("Llamado sin instancia");
    }
    
    void metodoNormal() {
        System.out.println("Necesita una instancia");
    }
}

// Uso:
Ejemplo.metodoEstatico();  // ✓ Funciona sin new
Ejemplo e = new Ejemplo();
e.metodoNormal();           // ✓ Necesita instancia

//esto es cuando se habla de un meotodo, pero si hablamos de una clase?
class ClaseEstatic {
    static class ClaseAnidada {
        void mostrar() {
            System.out.println("Clase anidada estática");
        }
    }
}
// Uso:
ClaseEstatic.ClaseAnidada obj = new ClaseEstatic.ClaseAnidada();
obj.mostrar();  // ✓ Acceso a clase anidada estática sin instancia de ClaseEstatic
