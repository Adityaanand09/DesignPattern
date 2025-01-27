package Chess.IMoveStrategy;

import Chess.PieceType;

public class BishopStrategy implements IMove{

    @Override
    public int[][] moveStrategy() {
        return new int[][]{{1,1},{1,-1},{-1,-1},{-1,1}};
    }
}
