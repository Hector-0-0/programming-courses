public class EjemploSwitch {
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Ejecucion del bloque 1");
        
        int numero = 1;
        
        //------------
        switch (numero) {
            
            case 1: System.out.println("Ejecucion del bloque valor 1");
            break;
            
            case 2: System.out.println("Ejecucion del bloque valor 2");
            break;
            
            case 3: System.out.println("Ejecucion del bloque valor 3");
            break;
            
            default: System.out.println("Ejecucion del bloque default");
            break;
        }
        
        //--------------
        
        
        
        
        if(numero == 1){
            System.out.println("Ejecucion del bloque valor 1");
        } else if  (numero == 2){
            System.out.println("Ejecucion del bloque valor 2");
        } else if  (numero == 3){
            System.out.println("Ejecucion del bloque valor 3");
        } else {
            System.out.println("Ejecucion del bloque default");
        }
        
        System.out.println("Ejecucion del bloque 2");
    }
    
    
    
    
}
