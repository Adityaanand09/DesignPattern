package SplitwiseLLD;

import java.util.List;

public class ExpenseController {
    SplitFactory factory =null;
    BalanceSheetController balanceSheetController;
    ExpenseController(SplitFactory fact, BalanceSheetController balanceSheetController){
        this.factory = fact;
        this.balanceSheetController = balanceSheetController;
    }

    public Expense createExpense(String name, String description, double amount,
                                 splitDetails paidBy, List<splitDetails> paidTo, Type t){

       ExpenseSplit splitType = factory.getSplitObj(t);
       if(splitType.verifySplit(paidTo,amount)){
            for(splitDetails s:paidTo){
                Expense e = new Expense(name,description,amount,paidBy.user,s.user,t);
                balanceSheetController.updateUserBalanceSheet(paidBy.user, paidTo, amount);
                return e;
            }
       }
       return null;
    }
}
