package VisitorDP.Element;

import VisitorDP.Operations.IRoomOperations;

public interface IRoomElement {
    public void accept(IRoomOperations operation);
    public int getRoomPrice();
}
