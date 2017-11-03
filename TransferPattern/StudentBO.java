package TransferPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by enes on 11/4/2017.
 */
public class StudentBO {

    List<StudentVO> students;

    public StudentBO(){
        students = new ArrayList<StudentVO>();
        StudentVO students1 = new StudentVO("Robert",0);
        StudentVO students2 = new StudentVO("John",1);
        students.add(students1);
        students.add(students2);
    }

    public void deleteStudent(StudentVO student){
        students.remove(student.getRollNo());
        System.out.println("Student: Roll No " + student.getRollNo() + ", deleted from database");
    }

    public List<StudentVO> getAllStudents(){
        return students;
    }

    public StudentVO getStudent(int rollNo){
        return students.get(rollNo);
    }

    public void updateStudent(StudentVO student){
        students.get(student.getRollNo()).setName(student.getName());
        System.out.println("Student: Roll No " + student.getRollNo() + ", updated in the database");
    }
}
