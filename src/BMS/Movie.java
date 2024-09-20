package BMS;

import java.util.List;

public class Movie {
    String name;
    int duration;
    List<Show> shows;

    Movie(String name, int dur, List<Show> s){
        this.name =name;
        this.duration = dur;
        this.shows =s;
    }

    public List<Show> getShows(){
        return shows;
    }
}
