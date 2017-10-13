package AbstractFactory;

/**
 * Created by enes on 10/14/2017.
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method");
    }
}
