package FlyweightDP;

public class Letter implements ILetter{
    private char ch;
    private String style;
    private int size;
    Letter(char c, String s, int size){
        this.ch =c;
        this.style=s;
        this.size=size;
    }

    char getCh(){
        return this.ch;
    }

    int size(){
        return this.size;
    }

    String getStyle(){
        return this.style;
    }
    /**
     * @param x
     * @param y
     */
    @Override
    public void display(int x, int y) {
        System.out.println(this.ch+" "+x+" "+y);
    }
}
