package ParkingLotLLD;

import java.util.List;

public class ParkingSpotManagerFactory {
    List<ParkingSpot> twoWheeler;
    List<ParkingSpot> fourWheeler;

    public ParkingSpotManagerFactory(List<ParkingSpot> twoWheeler, List<ParkingSpot> fourWheeler){
    this.fourWheeler = fourWheeler;
    this.twoWheeler = twoWheeler;
    }

   public ParkingSpotManager getPSManager(String vehicleType){
        if(vehicleType.equals("fourWheeler")){
            return new FourWheelerParkingSpotManager(fourWheeler);
        }else {
            return new TwoWheelerParkingSpotManager(twoWheeler);
        }
    }
}
