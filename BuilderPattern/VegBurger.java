package BuilderPattern;

/**
 * Created by enes on 10/14/2017.
 */
public class VegBurger extends Burger{


    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
