package ParkingLotLLD;

import java.util.List;

public class FourWheelerParkingSpotManager implements ParkingSpotManager {
    List<ParkingSpot> parkingSpots;

    public FourWheelerParkingSpotManager(List<ParkingSpot> p){
        this.parkingSpots = p;
    }
    @Override
    public ParkingSpot getSpot() {
        for( ParkingSpot ps: parkingSpots){
            if(ps.free == true){
                return ps;
            }
        }
        return null;
    }

    @Override
    public void freeSpot(ParkingSpot p) {
        p.free = true;
    }

    @Override
    public void addSpot(List<ParkingSpot> parkingSpots) {
        parkingSpots.addAll(parkingSpots);
    }

    @Override
    public void removeSpot(List<ParkingSpot> p) {
        parkingSpots.removeAll(p);
    }
}
