package PrototypePattern;


/**
 * Created by enes on 10/14/2017.
 */
public class Square extends Shape {

    public Square(){
        type="Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method");
    }
}
