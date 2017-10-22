package MementoPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by enes on 10/22/2017.
 */
public class CareTaker {
    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
}
