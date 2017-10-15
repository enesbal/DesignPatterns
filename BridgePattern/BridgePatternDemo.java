package BridgePattern;

/**
 * Created by enes on 10/15/2017.
 */
public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100,100,10,new RedCircle());
        Shape greenCircle = new Circle(100,100,10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
