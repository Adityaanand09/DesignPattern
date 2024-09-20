package Chess;

import Chess.IMoveStrategy.*;

import java.util.*;

public class GameManager {
    GameManager(){
        PrepareBoard();
    }

    public Player StartGame(){
        Queue<Player> chance = new ArrayDeque<>();
        List<String> l = new ArrayList<>();
        List<String> l1 = new LinkedList<>();
    }

    public void PrepareBoard(){
        Square[][] board = new Square[8][8];
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
