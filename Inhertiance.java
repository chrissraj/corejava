package Java;

public class Inhertiance {
    
    public static void main(String[] args) {
        Car car = new Mercedez();
        car.name();
    }
}


class Car{
    void name(){
        System.out.println("This is car");
    }
}

class Mercedez extends Car{

    @Override
    void name(){
        System.out.println("This is Mercedes");
    }

    void print(){
        System.out.println("mercedes");
    }
}
