package Chess;

import java.awt.*;

public class Square {
    Colour color;
    Piece piece;

    Piece isOccupied;
    Square(Piece p){
        this.piece = p;
    }
    Square(Colour c){
        this.color = c;
    }
}
