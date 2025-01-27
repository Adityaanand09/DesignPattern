package TempelateDP;

public class PayToCustomer extends PaymentFlow{
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
        System.out.println("2% fees ");
    }

    /**
     *
     */
    @Override
    void debitAmount() {
        System.out.println("debit Amount to customer A");
    }

    /**
     *
     */
    @Override
    void creditAmount() {
        System.out.println("credited Amount to customer");
    }
}

