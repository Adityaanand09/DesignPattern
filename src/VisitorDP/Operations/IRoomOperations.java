package VisitorDP.Operations;

import VisitorDP.Element.DeluxeRoom;
import VisitorDP.Element.DoubleRoom;
import VisitorDP.Element.IRoomElement;
import VisitorDP.Element.SingleRoom;

public interface IRoomOperations {
    public void visit(SingleRoom element);
    public void visit(DoubleRoom element);
    public void visit(DeluxeRoom element);
}
