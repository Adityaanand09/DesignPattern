package Chess.IMoveStrategy;

import Chess.PieceType;

public class KingStrategy implements IMove{

    /**
     * @param pieceType
     * @return
     */
    @Override
    public int[][] moveStrategy(PieceType pieceType) {
        return new int[][]{{0,1},{-1,0},{1,0},{0,-1}};
    }
}
