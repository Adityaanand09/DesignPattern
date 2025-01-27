package VisitorDP;

import VisitorDP.Element.DoubleRoom;
import VisitorDP.Element.IRoomElement;
import VisitorDP.Element.SingleRoom;
import VisitorDP.Operations.IRoomOperations;
import VisitorDP.Operations.RoomCost;

public class Main {
    public static void main(String args[]){

        IRoomOperations priceOperation = new RoomCost();
        IRoomElement roomElementSingle = new SingleRoom();
        roomElementSingle.accept(priceOperation);
        System.out.println("Single room price "+roomElementSingle.getRoomPrice());

        IRoomElement roomElementDouble = new DoubleRoom();
        roomElementDouble.accept(priceOperation);
        System.out.println("Double room price "+roomElementDouble.getRoomPrice());
    }
}
