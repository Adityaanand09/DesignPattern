package VendiingMachine_StateDesignPattern;

import java.util.List;

public class Disperse implements State{

    Disperse(){
        System.out.println("Machine is in disperse state");
    }

    @Override
    public void pressInsertCoin(VendingMachine machine) throws Exception {

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
    public void setIdleState(VendingMachine vm){
        vm.setVMState(new IdleState());
    }
}
