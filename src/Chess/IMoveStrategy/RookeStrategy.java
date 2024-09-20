package Chess.IMoveStrategy;

import Chess.PieceType;

public class RookeStrategy implements IMove{
    @Override
    public int[][] moveStrategy(PieceType pieceType) {
        return new int[][]{{1,0},{0,1},{-1,0},{0,-1}};
    }
}
