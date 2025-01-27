package MementoDP;

public class Originator {
    int height;
    int width;
    Originator(int h, int w){
        this.height = h;
        this.width = w;
    }

    public Memento createMemento(){
        return new Memento(height,width);
    }

    public void setHeight(int h){
        height = h;
    }

    public void setWidth(int w){
        width = w;
    }

    public void restoreMemento(Memento m){
        this.height = m.height;
        this.width = m.width;
    }
}
