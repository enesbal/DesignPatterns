package PrototypePattern;


/**
 * Created by enes on 10/14/2017.
 */
public class Rectangle extends Shape {
    public Rectangle(){
        type= "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method");
    }
}
