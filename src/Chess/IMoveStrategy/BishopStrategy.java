package Chess.IMoveStrategy;

import Chess.PieceType;

public class BishopStrategy implements IMove{
    /**
     * @param pieceType
     * @return
     */
    @Override
    public int[][] moveStrategy(PieceType pieceType) {
        return new int[][]{{1,1},{1,-1},{-1,-1},{-1,1}};
    }
}
