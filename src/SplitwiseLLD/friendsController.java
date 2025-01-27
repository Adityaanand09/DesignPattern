package SplitwiseLLD;

import java.util.List;

public class friendsController {
    List<User> friends;
    friendsController(List<User> friends){
        this.friends = friends;
    }

    public void addFriends(User u){
        friends.add(u);
    }
    public void removeFriends(User u){
        if(friends.contains(u)){
            friends.remove(u);
        }
    }
}
