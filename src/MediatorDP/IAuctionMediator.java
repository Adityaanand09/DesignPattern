package MediatorDP;

public interface IAuctionMediator {
    public void addBidder(IBidder bidder);
    public void placeBid(IBidder bidder, int amt);
}
