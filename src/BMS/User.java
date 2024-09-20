package BMS;

public class User {
    String id;
    int age;
    Location location;
    Seat s;
    User(String id, int a, Location loc){
        this.id =id;
        this.age =a;
        this.location=loc;
    }
}
