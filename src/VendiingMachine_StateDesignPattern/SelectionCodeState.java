package VendiingMachine_StateDesignPattern;

import java.util.List;

public class SelectionCodeState implements State{
    SelectionCodeState() {
       System.out.println("Machine is in Selection code state");
    }

    @Override
    public void DispenseState(VendingMachine vm){
        vm.setVMState(new Disperse());
    }

    @Override
    public void setIdleState(VendingMachine vm) {

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
        Shelf[] shelves = machine.shelves;
        int cost = 0;
        for(Shelf shelf:shelves){
            for(Item item:shelf.items){
                if(item.code == code && item.isAvailable==true && item.cost<=amountEntered){
                    item.isAvailable =false;
                    cost = item.cost;
                    System.out.println("Item Disperesed = "+item.type);
                    return amountEntered -cost;
                }
            }
        }
        if(cost>amountEntered){
            throw new Exception("Amount entered is less");
        }
        return amountEntered;
    }
}
