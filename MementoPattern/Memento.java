package MementoPattern;

/**
 * Created by enes on 10/22/2017.
 */
public class Memento {
    private String state;

    public Memento(String state){
        this.state=state;
    }

    public String getState(){
        return state;
    }
}
