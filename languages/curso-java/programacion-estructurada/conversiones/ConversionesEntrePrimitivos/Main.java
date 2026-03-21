public class Main {
    public static void main(String[] args) {
        //declaracion de variables
        byte num1 = 100;
        int num2 = 1300;
        
        float num3 = 4000.123f;
        double num4 = 5000.123456789123123;
        
        //conversion de ampliacion primitiva (implicita / automatica)
//        num2 = num1;
//        System.out.println(num1);
//        System.out.println(num2);
//        
//        num4 = num3;
//        System.out.println(num3);
//        System.out.println(num4);
        
        //conversiones de estrechamiento primitivo (explicita / manual)
        num1 = (byte) num2;
        System.out.println(num1);
        System.out.println(num2);
        
        num3 = (float) num4;
        System.out.println(num3);
        System.out.println(num4);
        
        
        
        
        
    }
    
}
