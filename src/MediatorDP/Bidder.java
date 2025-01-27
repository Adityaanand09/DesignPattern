package MediatorDP;

public class Bidder implements IBidder{
    IAuctionMediator mediator;
    String name;
    Bidder(IAuctionMediator mediator,String name){
        this.mediator = mediator;
        this.name = name;
        mediator.addBidder(this);
    }
    /**
     * @param b
     * @param amt
     */
    @Override
    public void placeBid(IBidder b, int amt) {
        mediator.placeBid(b,amt);
    }

    /**
     * @param b
     */
    @Override
    public void sendNotification(IBidder b, int amt) {
        System.out.println("bid increased to "+amt);
    }

    /**
     * @return
     */
    @Override
    public String getName() {
        return this.name;
    }
}
