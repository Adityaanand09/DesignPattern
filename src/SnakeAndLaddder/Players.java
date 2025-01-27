package SnakeAndLaddder;

public class Players {
    Piece p;
    int id;
    int currentPos;
    Players pl;

    Players(Piece p, int id){
        this.p =p;
        this.id = id;
    }

    public void SetPlayerCurrentPosition(Players p, int pos){
        p.currentPos = pos;
    }

    public int GetPlayerCurrentPosition(Players p){
        return p.currentPos;
    }
}
