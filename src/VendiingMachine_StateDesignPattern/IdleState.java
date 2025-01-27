package VendiingMachine_StateDesignPattern;

import java.util.List;

public class IdleState implements State{
    public void IdleState(){
        System.out.println("VM is in Idle state");
    }

    @Override
    public void pressInsertCoin(VendingMachine machine) throws Exception {
//        if(machine.state!=StateType.IDLE){
//            throw new Exception("wrong state");
//        }
//
//        machine.state = StateType.PRESS_ENTER_MONEY;
        machine.setVMState(new HasMoney());
    }

    @Override
    public int EnterCoin(VendingMachine machine, List<Coins> coins) throws Exception {
        return 0;
    }

    @Override
    public void EnterSelectionCodeState(VendingMachine machine) throws Exception {

    }

    @Override
    public int EnterSelectionCode(VendingMachine machine, int code, int amountEntered) throws Exception {
        return 0;
    }

    @Override
    public void DispenseState(VendingMachine vm) {

    }

    @Override
    public void setIdleState(VendingMachine vm) {

    }
}
