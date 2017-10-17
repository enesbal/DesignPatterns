package DecoratorPattern;

/**
 * Created by enes on 10/17/2017.
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
