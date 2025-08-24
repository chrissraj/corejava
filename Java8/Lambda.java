package Java.Java8;

public class Lambda {

    public static void main(String[] args) {
        
        Numbers numbers = (a,b)->System.out.println("Adding two numbers:-"+(a+b));
        numbers.add(10,15);
    
    }
    
}

@FunctionalInterface
interface Numbers{
    void add(int a, int b);
}
