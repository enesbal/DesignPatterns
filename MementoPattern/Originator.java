package MementoPattern;

/**
 * Created by enes on 10/22/2017.
 */
public class Originator {
    private String state;

    public void setState(String state){
        this.state = state;
    }
    public String getState(){
        return state;
    }
    public Memento saveStateToMemento(){
        return new Memento(state);
    }
    public void getStateFromMememto(Memento memento){
        state = memento.getState();
    }


}
