package VisitorDP.Element;

import VisitorDP.Operations.IRoomOperations;

public class SingleRoom implements IRoomElement{
    /**
     * @param operation
     */
    public int roomPrice=0;
    @Override
    public void accept(IRoomOperations operation) {
        operation.visit(this);
    }

    @Override
    public int getRoomPrice(){
        return roomPrice;
    }
}
