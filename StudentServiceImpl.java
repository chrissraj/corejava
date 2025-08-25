package Java;

public class StudentServiceImpl implements StudentInterface{

    public Student addStudent(){
        return new Student(2L, "Djokovic");
    }

    public void deleteStudent(){

        System.out.println("Student is deleted");
        System.out.println("need to add more info");
        
    }



}