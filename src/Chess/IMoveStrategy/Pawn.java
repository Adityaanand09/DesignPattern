package Chess.IMoveStrategy;

import Chess.PieceType;

public class Pawn implements IMove{
    /**
     * @param pieceType
     * @return
     */
    @Override
    public int[][] moveStrategy() {
        return new int[][]{{1,0},{1,1}};
    }
}
