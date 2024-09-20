package BMS;

import java.util.ArrayList;
import java.util.List;

public class BMSMain {
    public static void main(String args[]){
        List<Seat> seats = new ArrayList<>();
        for(int i=1;i<=100;i++){
            seats.add(new Seat(false,i));
        }
        Theatre t1 = new Theatre(seats,1);
        Theatre t2 = new Theatre(seats,2);
        Theatre t3 = new Theatre(seats,3);
        List<Integer> time1 = new ArrayList<>();
        time1.add(13);
        time1.add(15);
        time1.add(18);
        time1.add(20);

        List<Integer> time2 = new ArrayList<>();
        time2.add(13);
        time2.add(14);
        time2.add(16);
        time2.add(22);
        List<Show> shows = new ArrayList<>();
        Show s1 = new Show(t1,time1);
        Show s2 = new Show(t2,time2);
        shows.add(s2);
        shows.add(s1);


        User u1 = new User("1",18,new Location(new City("Lucknow")));

        Movie m1 =new Movie("Sholay", 210,shows);
        City c= new City("Lucknow");
        CityMovieController cmc = new CityMovieController(c,m1);
//        Movie m2 = new Movie("Dark knight Rises",130,)
        cmc.CreateBooking(1,c,"Sholay",u1,13);
    }
}
