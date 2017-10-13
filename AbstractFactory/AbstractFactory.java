package AbstractFactory;

/**
 * Created by enes on 10/14/2017.
 */
public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape);
}
