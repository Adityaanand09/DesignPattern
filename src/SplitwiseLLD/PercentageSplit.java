package SplitwiseLLD;

import java.util.List;

public class PercentageSplit implements ExpenseSplit{
    /**
     * @param friends
     * @param amount
     * @return
     */
    @Override
    public boolean verifySplit(List<splitDetails> friends, double amount) {
        return false;
    }
}
