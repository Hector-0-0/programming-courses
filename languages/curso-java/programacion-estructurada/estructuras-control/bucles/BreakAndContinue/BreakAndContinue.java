public class BreakAndContinue {
    public static void main(String[] args) {
        // TODO code application logic hereç
//
//        // ejemplo break
//        for (int dia = 1; dia <= 7; dia++) {
//            System.out.println("Dia de la semana: "+dia);
//            
//            if(dia == 5){
//                break;
//                
//            }
//        }
//        
//        System.out.println("Bucle finalziado");
        
        
        // ejemplo continue
        for (int dia = 1; dia <= 7; dia++) {
            System.out.println("Dia de la semana: "+dia);
            
            if(dia == 5){
                continue;
        
            }
            
            System.out.println("Hola----->>: "+dia);
            
        }
        
        System.out.println("Bucle finalziado");
        
        
        
    }

}
