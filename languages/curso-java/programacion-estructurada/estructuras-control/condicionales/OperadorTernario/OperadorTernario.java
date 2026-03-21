public class OperadorTernario {
    public static void main(String[] args) {
        // TODO code application logic here

        int x = 1;
        int y = 2;
        
        int numeroMayor = 0;
        
        numeroMayor = x > y ? x : y;
        System.out.println("El numero mayor: "+numeroMayor);
        
        
        if(x > y){
            System.out.println("El numero mayor: "+x);
        } else {
             System.out.println("El numero mayor: "+y);
        }
        
    }

}
