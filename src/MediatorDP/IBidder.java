package MediatorDP;

public interface IBidder {
    public void placeBid(IBidder b, int amt);
    public void sendNotification(IBidder b, int amt);
    public String getName();
}
