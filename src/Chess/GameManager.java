package Chess;

import Chess.IMoveStrategy.*;

import java.util.*;

public class GameManager {
    Deque<Player> chance = null;
    Square[][] board = null;
    GameManager(){
        PrepareBoard();
        chance = new ArrayDeque<>();
        Player p1 =new Player(Colour.Black);
        Player p2 =new Player(Colour.White);
        chance.add(p1);
        chance.add(p2);
    }

    public void StartGame(int xi, int yi, int xj, int yj){
        Player winner = null;


        while(winner == null){
            Player currPlayer = chance.remove();
            Square s = board[xi][yi];
            if(s.piece.color != currPlayer.color || s.isOccupied!=null &&s.isOccupied.color !=currPlayer.color){
                System.out.println("Wrong piece selected");
            }else{
                Piece piece = s.piece;
                IMove moveStrategy = piece.moveStrategy;
               int[][] moves = moveStrategy.moveStrategy();
               for(int[] move:moves){
                   int sr = xi;
                   int sc = yi;
                   int tr = sr+move[0];
                   int tc = sc+move[1];
                   if(tr>=0 && tc>=0 &&tr<8 && tc<8 &&(board[tr][tc].isOccupied==null ||board[tr][tc].isOccupied.color!=currPlayer.color)){
                       if(tr == xj && tc ==yj){
                           board[sr][sc].isOccupied =null;
                           board[tr][tc].isOccupied = piece;
                       }
                   }
               }
               chance.addLast(currPlayer);
            }
        }
        return;
    }

    public void PrepareBoard(){
        board = new Square[8][8];
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                if( i%2==0){
                    if(j%2==0){
                        board[i][j] = new Square(Colour.Black);
                    } else {
                        board[i][j] = new Square(Colour.White);
                    }
                }else{
                    if(j%2==1){
                        board[i][j] = new Square(Colour.Black);
                    } else {
                        board[i][j] = new Square(Colour.White);
                    }
                }
            }
        }

        for(int j=0;j<8;j++){
            board[1][j].piece = new Piece(PieceType.Pawn, Colour.White,new Pawn());
            board[6][j].piece = new Piece(PieceType.Pawn, Colour.Black,new Pawn());
            PutPiece(board,0, j, Colour.White);
            PutPiece(board,1,  j, Colour.Black);
        }
    }
    private void PutPiece(Square[][] board,int row, int col, Colour colour) {
        if(col ==0|| col ==7){
            board[row][col].piece =new Piece(PieceType.Rook,colour,new RookeStrategy());
        }

        if(col ==1|| col ==6){
            board[row][col].piece =new Piece(PieceType.Knight,colour,new KnightMoveStrategy());
        }

        if(col ==2|| col ==5){
            board[row][col].piece =new Piece(PieceType.Bishop,colour, new BishopStrategy());
        }
        if(col ==3){
            board[row][col].piece =new Piece(PieceType.Queen, colour,new QueenStrategy());
        }

        if(col ==4){
            board[row][col].piece =new Piece(PieceType.King, colour,new KingStrategy());
        }
    }
}
