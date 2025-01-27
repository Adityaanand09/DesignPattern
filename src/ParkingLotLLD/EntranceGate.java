package ParkingLotLLD;

public class EntranceGate {
    Ticket t;
    ParkingSpotManagerFactory psmf;

    EntranceGate(Ticket t, ParkingSpotManagerFactory psmf){
        this.t =t;
        this.psmf =psmf;
    }

    public void setSpot(){
        Enum vehicleType = t.v.VehicleType;
        ParkingSpotManager psManager;
        if(vehicleType == VehicleType.FourWheeler){
            psManager = psmf.getPSManager("fourWheeler");
        }else{
            psManager = psmf.getPSManager("twoWheeler");
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
