package BMS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CityMovieController {
Map<City, List<Movie>> cityMovieMap;

CityMovieController(City c, Movie m){
    cityMovieMap =new HashMap<>();
    addMovieToCity(c,m);
}

    private void addMovieToCity(City c, Movie m) {
    if(cityMovieMap.containsKey(c)){
            List<Movie> movies = cityMovieMap.get(c);
            movies.add(m);
        cityMovieMap.put(c,movies);
        }else{
        List<Movie> movies = new ArrayList<>();
        movies.add(m);
        cityMovieMap.put(c,movies);
        }
    }

    public List<Movie> getMoviesInCity(City c) {
        if (cityMovieMap.containsKey(c)) {
            return cityMovieMap.get(c);
        } else {
            return null;
        }
    }

    public void CreateBooking(int bookingSeats,City c, String movieName, User u, Integer t){
    List<Movie> movies= cityMovieMap.get(c);
    for(Movie movie:movies){
        if(movie.name.equals(movieName) && movies.contains(movie)){
            List<Show> shows = movie.getShows();
            System.out.println("Shows Available");
            for(Show s:shows){
                System.out.println(s.time);
                if(s.time.contains(t)){
                    List<Seat>seats =  s.theatre.seats;
                    for(Seat s1:seats){
                        if(s1.isBooked==false){
                            s1.isBooked = true;
                            u.s = s1;
                            System.out.println("Seat"+s1.seatId+ "Booked for User with id = "+u.id);
                            bookingSeats--;
                            break;
                        }
                    }
                    if(bookingSeats == 0){
                        return;
                    }
                }
            }
        }
    }
    }
}
