package MementoDP;

public class Memento {
    int height;
    int width;
    Memento(int h, int w){
        this.height =h;
        this.width =w;
    }

    public int getHeight(){
        return height;
    }

    public int getWidth(){
        return width;
    }
}
