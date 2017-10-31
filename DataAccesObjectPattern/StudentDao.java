package DataAccesObjectPattern;

import java.util.List;

/**
 * Created by enes on 10/31/2017.
 */
public interface StudentDao {
    public List<Student> getAllStudents() ;
    public Student getStudent(int rollNo);
    public void updateStudent(Student student);
    public void deleteStudent(Student student);
}
