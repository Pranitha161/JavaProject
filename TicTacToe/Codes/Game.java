package game;
import player.Player;
import board.Board;
import java.util.*;
public class Game {
    Player[] players;
    Board board;
    int turn;
    int noOfMoves;
    Boolean gameOver;
    String zero;
    String cross;
    public Game(Player[] players,Board board){
        this.players=players;
        this.board=board;
        this.turn=0;
        this.noOfMoves=0;
        this.gameOver=false;
        StringBuilder z=new StringBuilder();
        StringBuilder c=new StringBuilder();
        for(int i=0;i<board.size;i++){
            z.append('O');
            c.append('X');
        }
        this.zero=z.toString();
        this.cross=c.toString();
    }
    
    public void printboardConfig(){
        int sz=this.board.size;
        for(int i=0;i<sz;i++){
            for(int j=0;j<sz;j++){
                System.out.print(board.matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public void play(){
        int sz=board.size;
        while(!gameOver){
            printboardConfig();
            noOfMoves++;
            int idx=getIndex();
            int row=idx/sz;
            int col=idx%sz;
            board.matrix[row][col]=players[turn].getPlayerSymbol();
            if(noOfMoves>=(sz*sz)){
                System.out.println("Game Draw");
                return;
            }
            if(noOfMoves>=2*sz-1 && checkCombinations()==true){
                gameOver=true;
                printboardConfig();
                System.out.println("Winner is: "+players[turn].getPlayerName());
                return;
            }
            turn=(turn+1)%2;
        }
    }
    public int getIndex(){
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("Player "+players[turn].getPlayerName()+" give one position: ");
            int pos=sc.nextInt()-1;
            int sz=board.size;
            int row=pos/sz;
            int col=pos%sz;
            if(row<0||row>=sz||col<0||col>=sz){
                System.out.println("Invalid Position!");
                continue;
            }
            if(board.matrix[row][col]!='-'){
                System.out.println("Position alread Occupied");
                continue;
            }
            return pos;
        }
        
    }
    public boolean checkCombinations(){
        int sz=board.size;
        for(int i=0;i<sz;i++){
            StringBuilder sbr=new StringBuilder(); //StringBuilder for row
            StringBuilder sbc=new StringBuilder(); //StringBuilder for column
            for(int j=0;j<sz;j++){
                sbr.append(board.matrix[i][j]);
                sbc.append(board.matrix[j][i]);
            }
            String pattern=sbr.toString();
            String pattern1=sbc.toString();
            if(pattern.equals(zero)||pattern.equals(cross)||pattern1.equals(zero)||pattern1.equals(cross)){
                return true;
            }
        }
        StringBuilder sb=new StringBuilder();
        StringBuilder sb1=new StringBuilder();
        for(int i=0;i<sz;i++){
            sb.append(board.matrix[i][i]); //appending diagonal elements
            sb1.append(board.matrix[i][sz-i-1]); // appending anti-diagonal elemets
        }
        String pattern =sb.toString();
        String pattern1=sb1.toString();
        if(pattern.equals(zero)||pattern.equals(cross)||pattern1.equals(zero)||pattern1.equals(cross)){
            return true;
        }
        return false;
    }
}
