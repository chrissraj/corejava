package Java;

public class ClassAndObject {
    public static void main(String[] args) {
        Student student = new Student(1, "Maximilan");
        System.out.println(student.getId()+"--"+student.getName());
    }
}

class Student{
    private Long id;
    private String name;

    Student(Long id, String name){
        this.id = id;
        this.name = name;
    }

    public Long getId(){
        return this.id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }
}
