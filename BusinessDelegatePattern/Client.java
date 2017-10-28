package BusinessDelegatePattern;

/**
 * Created by enes on 10/29/2017.
 */
public class Client {
    BusinessDelegate businessDelegate;

    public Client(BusinessDelegate businessDelegate){
        this.businessDelegate = businessDelegate;
    }

    public void doTask(){
        businessDelegate.doTask();
    }
}
