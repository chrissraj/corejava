package Java;

public class PatternPrinting {
    
    public static void main(String[] args) {

        int i=0;
       while(i<10){
        for(int j=0;j<10;j++){
            System.out.println("@");

    System.out.println("This is a pattern printing");
       

        }
        i++;
       }

       System.out.println("Printing pattern in feature branch");

     
       for(int i=0;i<9;i++){

        for(int j=0;j<i;j++){
            System.out.println("#");
        }
       }
    }
}
