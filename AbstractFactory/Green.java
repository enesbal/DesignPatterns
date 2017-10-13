package AbstractFactory;

/**
 * Created by enes on 10/14/2017.
 */
public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
