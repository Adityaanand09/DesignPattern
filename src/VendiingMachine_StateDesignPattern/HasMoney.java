package VendiingMachine_StateDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class HasMoney implements State{

    public HasMoney(){
        System.out.println("VM is in HasMoney State");
    }

    @Override
    public void pressInsertCoin(VendingMachine machine) throws Exception {

    }

    @Override
    public int EnterCoin(VendingMachine machine, List<Coins> coins) throws Exception {
        if(machine.coins==null){
            machine.coins = new ArrayList<>();
        }
        int totalAmt =0;
        for(Coins i:coins){
            machine.coins.add(i);
            if(i==Coins.Five_Rupee_Coin){
                totalAmt+=5;
            }else if(i==Coins.Ten_Rupee_Coin){
                totalAmt+=10;
            }
        }
        return totalAmt;

    }

    public void EnterSelectionCodeState(VendingMachine vm){
        vm.setVMState(new SelectionCodeState());
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
