package CommandDP;

public class Main {
    public static void main(String args[]){
        AC ac = new AC();
        Invoker invoker = new Invoker(new TurnOnCommand(ac));
        invoker.pressOnButton();
    }
}
