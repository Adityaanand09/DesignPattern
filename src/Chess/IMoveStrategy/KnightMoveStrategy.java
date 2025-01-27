package Chess.IMoveStrategy;

import Chess.PieceType;

public class KnightMoveStrategy implements IMove{
    @Override
    public int[][] moveStrategy() {
        int[][] move = new int[][]{{2,1},{2,-1},{-2,1},{-2,-1}};
        return move;
    }
}
