package NullObjectPattern;

/**
 * Created by enes on 10/24/2017.
 */
public class NullCustomer extends AbstractCustomer {
    @Override
    public boolean isNil() {
        return true;
    }

    @Override
    public String getName() {
        return "Not available in customer database";
    }
}
