package StatePattern;

/**
 * Created by enes on 10/23/2017.
 */
public class Context {
    private State state;

    public Context(){
        state=null;
    }

    public void setState(State state){
        this.state=state;
    }

    public State getState(){
        return state;
    }
}
