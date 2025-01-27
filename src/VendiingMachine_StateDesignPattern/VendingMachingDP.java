package VendiingMachine_StateDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class VendingMachingDP {
    public static void main(String args[]) throws Exception {
        int c =0;
        Shelf[] shelves = new Shelf[10];
        for(int i=0;i<10;i++){
            Item[] items = new Item[5];
            for(int j=0;j<5;j++){
                ItemType type = null;
                if(j%2 ==0){
                    type = ItemType.COKE;
                }else if(j%3 ==0){
                    type = ItemType.Kurkure;
                }else{
                    type = ItemType.Lays;
                }
                Item item = new Item(c++,type);
                items[j] = item;
            }
            Shelf shelf = new Shelf(items);
            shelves[i] = shelf;
        }

        VendingMachine vm = new VendingMachine(shelves);
        State state = vm.getVMState();

//        Set machine to Idle state
//        vm.setState(vm);

        //Enter coin
        List<Coins> coins= new ArrayList<>();
        coins.add(Coins.Five_Rupee_Coin);
        coins.add(Coins.Ten_Rupee_Coin);
        state.pressInsertCoin(vm);
        state = vm.getVMState();
        int amountEntered= state.EnterCoin(vm,coins);

       //Enter Selection Code state

        state.EnterSelectionCodeState(vm);
        state = vm.getVMState();
       int remainingMoney = state.EnterSelectionCode(vm,5,amountEntered);
        if(remainingMoney!=amountEntered){
            state.DispenseState(vm);
        }

        System.out.println("Item Dispersed and amount returned ="+remainingMoney);

        state.setIdleState(vm);
        state = vm.getVMState();

    }
}
