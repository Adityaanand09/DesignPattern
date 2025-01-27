package MediatorDP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AuctionMediator implements IAuctionMediator{
    List<IBidder> bidders;
    AuctionMediator(){
        bidders = new ArrayList<>();
    }
    /**
     *
     */
    @Override
    public void addBidder(IBidder bidder) {
        bidders.add(bidder);
    }

    /**
     *
     */
    @Override
    public void placeBid(IBidder bidder, int amt) {
//        HashMap
        for(IBidder b:bidders){
            if(!b.getName().equals(bidder.getName())){
                b.sendNotification(b,amt);
            }
        }
    }
}
