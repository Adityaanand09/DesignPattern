package SnakeAndLaddder;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class main {
     public static  void main(String args[]){

         //Create cells without adding jump
         Cells[][] board = new Cells[10][10];

         for(int i=0;i<10;i++){
             for(int j=0;j<10;j++){
                 board[i][j] = new Cells(null);
             }
         }


         int numberOfSnake = 10;
         int numberOfLadder = 10;

         while(numberOfLadder>0){
             int start = ThreadLocalRandom.current().nextInt(1,10*10);
             int end = ThreadLocalRandom.current().nextInt(1,10*10);

             if(start>=end){
                 continue;
             }

             Jump ladder = new Jump(start,end);
             Cells c = getCell(board,start);
             c.jump = ladder;
             System.out.println("Ladders are at position "+ladder.start);
             numberOfLadder--;
         }

         while(numberOfSnake>0){
             int start = ThreadLocalRandom.current().nextInt(1,10*10);
             int end = ThreadLocalRandom.current().nextInt(1,10*10);

             if(end>=start){
                 continue;
             }

             Jump snake = new Jump(end,start);
             Cells c = getCell(board,end);
             c.jump = snake;
             System.out.println("Snakes are at position "+snake.start);
             numberOfSnake--;
         }
         Players p1 = new Players(Piece.star,1);
         Players p2 = new Players(Piece.cross,2);
         p1.SetPlayerCurrentPosition(p1,0);
         p2.SetPlayerCurrentPosition(p2,0);

         Deque<Players> next = new ArrayDeque<>();
         next.addFirst(p1);
         next.addFirst(p2);
         Dice dice = new Dice(6);
         startGame(board,next,dice);

     }

     public static void startGame(Cells[][] b, Deque<Players> next, Dice dice){
         Players winner = null;
         while(winner == null){
             int steps = rollDice(dice);
             Players p = next.removeFirst();
             int pos= p.GetPlayerCurrentPosition(p);
             pos=(pos+steps)%101;

//             if(pos == 100){
//                 System.out.println("got 100!!");
//             }
//             HashMap
             Cells newCell = getCell(b,pos);
             if(newCell.jump!=null){
                 p.SetPlayerCurrentPosition(p,newCell.jump.end);
                 if(p.currentPos == 100){
                     winner  = p;
                     System.out.println("Winner is Player "+p.id);
                     break;
                 }
                 next.addLast(p);
             } else{
                 if(p.currentPos == 100){
                     winner  = p;
                     System.out.println("Winner is Player "+p.id);
                     break;
                 }
                 System.out.println("Player with id "+p.id +" is at position "+pos);
                 p.SetPlayerCurrentPosition(p,pos);
                 next.addLast(p);
             }
         }
     }

     public static int rollDice(Dice dice){
         return ThreadLocalRandom.current().nextInt(1,dice.max);
     }

     public static Cells getCell(Cells[][] board, int start){
         int r = start/10;
         int c = start%10;
         if(r>=10 || c>=10){
             return board[9][9];
         }
         return board[r][c];
     }
}
