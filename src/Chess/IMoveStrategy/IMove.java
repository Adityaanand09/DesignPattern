package Chess.IMoveStrategy;

import Chess.PieceType;

public interface IMove {
    int[][] moveStrategy(PieceType pieceType);
}
