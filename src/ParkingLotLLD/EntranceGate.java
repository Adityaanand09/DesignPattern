package ParkingLotLLD;

public class EntranceGate {
    Ticket t;
    ParkingSpotManagerFactory ps;

    EntranceGate(Ticket t, ParkingSpotManagerFactory ps){
        this.t =t;
        this.ps =ps;
    }

    public void setSpot(){
        Enum vehicleType = t.v.VehicleType;
        ParkingSpotManager psManager;
        if(vehicleType == VehicleType.FourWheeler){
            psManager = ps.getPSManager("fourWheeler");
        }else{
            psManager = ps.getPSManager("twoWheeler");
        }
       t.ps = psManager.getSpot();
    }

    public void setEntryTime(){
        t.entryTime = System.currentTimeMillis();
    }

    public void setId(){
        t.id = System.currentTimeMillis()+"";
    }
}
