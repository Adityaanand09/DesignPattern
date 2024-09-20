package VendiingMachine_StateDesignPattern;

import java.util.List;

public interface State {
    void pressInsertCoin(VendingMachine machine) throws Exception;

    int EnterCoin(VendingMachine machine, List<Coins> coins) throws Exception;

    void EnterSelectionCodeState(VendingMachine machine) throws Exception;
    int EnterSelectionCode(VendingMachine machine,int code, int amountEntered)throws Exception;

    void DispenseState(VendingMachine vm);

    void setIdleState(VendingMachine vm);
}
