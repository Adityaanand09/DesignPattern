package TempelateDP;

public abstract class PaymentFlow {
    abstract void validateRequest();
    abstract void calculateFees();
    abstract void debitAmount();
    abstract void creditAmount();


    //this is the tempelate method, no child class can override it since it is declared final
    public final void sendMoney(){
        validateRequest();
        calculateFees();
        debitAmount();
        creditAmount();
    }
}
