package SplitwiseLLD;

import java.util.List;

public class Expense {
    String name;
    String description;
    double amount;
    User paidBy;
    User paidTo;
    Type t;

    Expense(String name, String description, double amount, User paidBy, User paidTo, Type t){
        this.name =name;
        this.description =description;
        this.amount =amount;
        this.paidBy = paidBy;
        this.paidTo = paidTo;
        this.t =t;
    }
}
