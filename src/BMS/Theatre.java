package BMS;

import java.util.List;

public class Theatre {
    List<Seat> seats;
    int theatreId;

    Theatre(List<Seat> s, int id){
        this.seats =s;
        this.theatreId  =id;
    }
}
