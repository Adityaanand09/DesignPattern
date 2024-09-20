package ParkingLotLLD;

public class ParkingSpot {
    Enum vehicleType;
    boolean free;

    public ParkingSpot(Enum vt, boolean free){
        vehicleType = vt;
        this.free =free;
    }
}
