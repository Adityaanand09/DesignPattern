package MementoDP;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    List<Memento> mementos;

    Caretaker(){
        mementos = new ArrayList<>();
    }

    public void addMemento(Memento m){
        mementos.add(m);
    }

    public Memento undo(){
        Memento lastMemento = mementos.get(mementos.size()-1);
        mementos.remove(mementos.size()-1);
        return lastMemento;
    }
}
