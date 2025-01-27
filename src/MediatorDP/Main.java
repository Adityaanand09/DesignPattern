package MediatorDP;

public class Main {
public static void main(String args[]){
    IAuctionMediator mediator = new AuctionMediator();
    IBidder bidder1 = new Bidder(mediator,"A");
    IBidder bidder2 = new Bidder(mediator,"B");

    bidder1.placeBid(bidder1,100);
    bidder1.placeBid(bidder2,200);
}
}
