package InterceptingFilterPattern;

/**
 * Created by enes on 11/2/2017.
 */
public class Target {
    public void execute(String request){
        System.out.println("Executing request: "+ request);
    }
}
