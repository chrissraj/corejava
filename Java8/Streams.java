package Java.Java8;

import java.util.List;

public class Streams {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(7,6,5,4,3,2,1);
        System.out.println(numbers.stream().sorted().toList());

        System.out.println(numbers.stream().filter(x->x%2==0).toList());

        System.out.println(numbers.stream().map(t->t*2).toList());

        System.out.println(numbers.stream().anyMatch(x->x%2==1));
        System.out.println(numbers.stream().toList());

        System.out.println(numbers.stream().findAny());
    }
    
}
