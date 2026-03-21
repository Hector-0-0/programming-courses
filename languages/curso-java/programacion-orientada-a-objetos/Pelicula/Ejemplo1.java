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
