package Java;

public class PatternPrinting {
    
    public static void main(String[] args) {
    System.out.println("This is a pattern printing");
       for(int i=0;i<9;i++){
        for(int j=0;j<9;j++){
            System.out.println("#");
        }
       }

       System.out.println("Pattern printing is cool, Pattern printing is nice");

       for(int i=0;i<9;i++){
        for(int j=0;j<i;j++){
            System.out.println("#");
        }
       }
    }
}
