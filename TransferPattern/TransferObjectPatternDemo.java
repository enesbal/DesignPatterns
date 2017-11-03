package TransferPattern;

/**
 * Created by enes on 11/4/2017.
 */
public class TransferObjectPatternDemo {
    public static void main(String[] args) {
        StudentBO studentBusinessObject = new StudentBO();

        for(StudentVO student : studentBusinessObject.getAllStudents()){
            System.out.println("Student: [RollNo : " + student.getRollNo());
        }

        //update stundent
        StudentVO student = studentBusinessObject.getAllStudents().get(0);
        student.setName("Michael");
        studentBusinessObject.updateStudent(student);

        //get the student
        student = studentBusinessObject.getStudent(0);
        System.out.println("Student: [Roll No: " + student.getRollNo() + ", Name: " + student.getName() + " ]");
    }
}
