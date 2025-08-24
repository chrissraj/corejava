package Java;

interface StudentService{
  Student addStudent();
  void deleteStudent();
}
  
public interface StudentInterface extends StudentService{}