package StatePattern;

import javax.naming.Context;

/**
 * Created by enes on 10/23/2017.
 */
public class StopState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
    }
}
