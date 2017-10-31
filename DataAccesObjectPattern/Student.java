package DataAccesObjectPattern;

/**
 * Created by enes on 10/31/2017.
 */
public class Student {
    private String name;
    private int rollNo;

    Student(String name, int rollNo){
        this.name= name;
        this.rollNo = rollNo;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getRollNo()
    {
        return rollNo;
    }

    public void setRollNo(int rollNo){
        this.rollNo=rollNo;
    }
}
