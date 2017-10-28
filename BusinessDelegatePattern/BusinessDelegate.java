package BusinessDelegatePattern;

/**
 * Created by enes on 10/29/2017.
 */
public class BusinessDelegate {
    private BusinessLookUp lookUpService = new BusinessLookUp();
    private BusinessService businessService;
    private String serviceType;

    public void setServiceType(String serviceType){
        this.serviceType = serviceType;
    }

    public void doTask(){
        businessService = lookUpService.getBusinessService(serviceType);
        businessService.doProcessing();
    }
}
