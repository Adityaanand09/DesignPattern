package VendiingMachine_StateDesignPattern;

public class Item {
    int code;
    ItemType type;
    boolean isAvailable;
    int cost;

    Item(int c, ItemType i){
        this.code= c;
        this.type = i;
        this.isAvailable =true;
        this.cost = 10;
    }
}
