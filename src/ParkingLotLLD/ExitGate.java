package ParkingLotLLD;

public class ExitGate {
    ParkingSpotManagerFactory psmf;
    public ExitGate(ParkingSpotManagerFactory psmf){
        this.psmf = psmf;
    }

    public void freeSpot(Ticket t){
        Vehicle vehicle = t.v;
        if(vehicle.VehicleType == VehicleType.FourWheeler){
            ParkingSpotManager fwPSM=psmf.getPSManager("fourWheeler");
            fwPSM.freeSpot(t.ps);
        }else{
            ParkingSpotManager twPSM=psmf.getPSManager("twoWheeler");
            twPSM.freeSpot(t.ps);
        }
    }

    public void getCost(Vehicle v){
        System.out.println(v.vehicleNumber+" "+v.VehicleType+" "+100);
    }
}
