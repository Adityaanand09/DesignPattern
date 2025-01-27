package CommandDP;

public class Invoker {
    ICommand command;
    Invoker(ICommand c){
        command = c;
    }

    public void pressOnButton(){
        command.execute();
    }
}
