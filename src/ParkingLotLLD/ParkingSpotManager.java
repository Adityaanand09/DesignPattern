package ParkingLotLLD;

import java.util.List;

public interface ParkingSpotManager {
    public ParkingSpot getSpot();
    public void freeSpot(ParkingSpot p);
    public void addSpot(List<ParkingSpot> parkingSpots);
    public void removeSpot(List<ParkingSpot> parkingSpots);
}
