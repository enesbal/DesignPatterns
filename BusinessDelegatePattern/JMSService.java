package BusinessDelegatePattern;

/**
 * Created by enes on 10/29/2017.
 */
public class JMSService implements BusinessService {
    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking JMS Service");
    }
}
