package NullObjectPattern;

/**
 * Created by enes on 10/24/2017.
 */
public class RealCustomer extends AbstractCustomer {

    public RealCustomer(String name){
        this.name=name;
    }

    @Override
    public boolean isNil() {
        return true;
    }

    @Override
    public String getName() {
        return name;
    }
}
