package InterceptingFilterPattern;

/**
 * Created by enes on 11/2/2017.
 */
public class AuthenticationFilter implements  Filter{
    @Override
    public void execute(String request) {
        System.out.println("Authentication request: "+request);
    }
}
