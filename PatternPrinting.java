package Java;

public class PatternPrinting {
    
    public static void main(String[] args) {
        
        for(int i=5;i>=0;i--){
            for(int j=i;j>=0;j--)
            {
                System.out.print("#");
            }

            System.out.println();
        }

        for(int i=0;i<=5;i++){
            for(j=0;j<=i;j++){
                System.out.println("*");
            }
        }
    }
}
