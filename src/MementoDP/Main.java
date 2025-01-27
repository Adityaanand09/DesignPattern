package MementoDP;

public class Main {
    public static void main(String args[]){
        Caretaker ct = new Caretaker();
        Originator org = new Originator(2,3);
        Memento ss1 = org.createMemento();
        ct.addMemento(ss1);

        org.setHeight(4);
        org.setWidth(33);

        Memento oldObj = ct.undo();
        org.restoreMemento(oldObj);

        System.out.println("Restored Obj "+org.height+" "+org.width);

    }
}
