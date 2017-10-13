package AbstractFactory;

/**
 * Created by enes on 10/14/2017.
 */
public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
