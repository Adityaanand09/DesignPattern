package FlyweightDP;

public class Main {

    public static void main(String args[]){
       LetterFactory lf = new LetterFactory();
       ILetter lt = lf.createLetter('t');
       lt.display(5,4);
    }
}
