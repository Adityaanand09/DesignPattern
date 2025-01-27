package SplitwiseLLD;

import java.util.HashMap;
import java.util.Map;

public class UserBalanceSheet {
    Map<String,Balance> userBalanceSheet;//Balance sheet that maintain the amount owned and owed for every user with each of his frnd
    double totalPayment;
    double totalAmountYouOwe;
    double totalYouGetBack;
    UserBalanceSheet(){
        userBalanceSheet = new HashMap<>();
        totalPayment =0;
        totalAmountYouOwe=0;
        totalYouGetBack=0;
    }

    public Map<String, Balance> getUserVsBalance(){
        return userBalanceSheet;
    }

    public void setTotalExpense(double totalExpense) {
        this.totalPayment = totalExpense;
    }

    public double getTotalExpense(){
        return totalPayment;
    }

    public double getTotalAmountYouOwe(){
        return totalAmountYouOwe;
    }

    public void setTotalYourExpense(double totalAmountYouOwe){
        this.totalAmountYouOwe = totalAmountYouOwe;
    }

    public void setTotalAmountYouGetBack(double d){
        this.totalYouGetBack =totalYouGetBack;
    }

    public double getTotalYouGetBack(){
        return totalYouGetBack;
    }
}
