package ObserverPattern;

/**
 * Created by enes on 10/22/2017.
 */
public class OctalObserver extends Observer {

    public OctalObserver(Subject subject){
        this.subject=subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Octal String: " + Integer.toOctalString(subject.getState()));
    }
}
