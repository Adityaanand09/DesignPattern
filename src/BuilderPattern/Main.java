package BuilderPattern;

public class Main {

    public static  void main(String args[]) {
        Director d = new Director(new EngineeringStudentBuilder());
    }
}
