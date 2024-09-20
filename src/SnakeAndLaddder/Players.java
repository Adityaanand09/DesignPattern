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

    Players(Players p){
        this.pl = p;
    }

    public void SetPlayerCurrentPosition(Players p, int pos){
        p.currentPos = pos;
    }

    public int GetPlayerCurrentPosition(Players p){
        return p.currentPos;
    }
}
