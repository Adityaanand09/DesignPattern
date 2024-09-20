package Chess;

import Chess.IMoveStrategy.IMove;

import java.awt.*;

public class Piece{
    PieceType pieceType;
    Colour color;
    IMove moveStrategy;

    Piece(PieceType pieceType, Colour color, IMove moveStrategy){
        this.pieceType = pieceType;
        this.color = color;
        this.moveStrategy = moveStrategy;
    }
}
