package StatePattern;


/**
 * Created by enes on 10/23/2017.
 */
public class StartState implements State {
    public void doAction(Context context){
        System.out.println("Player is in start state");
        context.setState(this);
    }
    public String toString(){
        return "Start State";
    }
}
