package BuilderPattern;

/**
 * Created by enes on 10/14/2017.
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing(){
        return new Bottle();
    }

    @Override
    public abstract float price();
}
