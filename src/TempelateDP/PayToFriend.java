package TempelateDP;

public class PayToFriend extends PaymentFlow{
    /**
     *
     */
    @Override
    void validateRequest() {
        System.out.println("validated req");
    }

    /**
     *
     */
    @Override
    void calculateFees() {
        System.out.println("0% fees ");
    }

    /**
     *
     */
    @Override
    void debitAmount() {
        System.out.println("debitAmount");
    }

    /**
     *
     */
    @Override
    void creditAmount() {
        System.out.println("credited Amount");
    }
}
