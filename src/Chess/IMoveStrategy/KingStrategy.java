package Chess.IMoveStrategy;

import Chess.PieceType;

public class KingStrategy implements IMove{
    @Override
    public int[][] moveStrategy() {
        return new int[][]{{0,1},{-1,0},{1,0},{0,-1}};
    }
}
