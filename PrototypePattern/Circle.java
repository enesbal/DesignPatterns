package PrototypePattern;

/**
 * Created by enes on 10/14/2017.
 */
public class Circle extends Shape {
    public Circle(){
        type="Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method");
    }
}
