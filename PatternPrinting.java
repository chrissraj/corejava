package Java;

public class PatternPrinting {
    
    public static void main(String[] args) {
        
       for(int i=0;i<100;i++){
        for(int j=0;j<50;j++){
            System.out.println("@");
        }
       }

       System.out.println("Pattern printing is cool, Pattern printing is nice");

       for(int i=0;i<5;i++){
        for(int j=0;j<i;j++){
            System.out.println("@");
        }
       }
    }
}
