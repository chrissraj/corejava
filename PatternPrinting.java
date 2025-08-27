package Java;

public class PatternPrinting {
    
    public static void main(String[] args) {
        int i=0;
       while(i<10){
        for(int j=0;j<10;j++){
            System.out.println("@");
        }
        i++;
       }

       System.out.println("Printing pattern in feature branch");

       for(i=0;i<15;i++){
        for(int j=0;j<i;j++){
            System.out.println("@");
        }
       }
    }
}
