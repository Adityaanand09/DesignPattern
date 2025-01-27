package CommandDP;

public class TurnOnCommand implements ICommand{
    AC ac;
    TurnOnCommand(AC ac){
        this.ac =ac;
    }

    @Override
    public void execute() {
        ac.on();
    }
}
