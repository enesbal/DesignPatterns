package ObserverPattern;

/**
 * Created by enes on 10/22/2017.
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
