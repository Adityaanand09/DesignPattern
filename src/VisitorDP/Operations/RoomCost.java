package VisitorDP.Operations;

import VisitorDP.Element.DeluxeRoom;
import VisitorDP.Element.DoubleRoom;
import VisitorDP.Element.IRoomElement;
import VisitorDP.Element.SingleRoom;

public class RoomCost implements IRoomOperations{
    /**
     * @param element
     */
    @Override
    public void visit(SingleRoom element) {
        element.roomPrice = 100;
    }

    /**
     * @param element
     */
    @Override
    public void visit(DoubleRoom element) {
        element.roomPrice =200;
    }

    /**
     * @param element
     */
    @Override
    public void visit(DeluxeRoom element) {
element.roomPrice = 500;
    }
}
