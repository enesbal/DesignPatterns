package BuilderPattern;

/**
 * Created by enes on 10/14/2017.
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing(){
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
