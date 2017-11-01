package InterceptingFilterPattern;

/**
 * Created by enes on 11/2/2017.
 */
public class DebugFilter implements Filter {
    @Override
    public void execute(String request) {
        System.out.println("request log: "+request);
    }
}
