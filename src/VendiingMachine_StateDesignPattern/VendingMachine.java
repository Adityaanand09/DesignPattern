package VendiingMachine_StateDesignPattern;

import java.util.List;

public class VendingMachine {
    State state;
    Shelf[] shelves;

    List<Coins> coins;

    VendingMachine(Shelf[] shelf){
        this.shelves = shelf;
        state = new IdleState();
    }


    public State getVMState(){
        return state;
    }

    public void setVMState(State state){
        this.state = state;
    }

}
