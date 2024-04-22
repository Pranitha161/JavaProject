import player.Player;
import board.Board;
import dice.Dice;
import jumper.Jumper;
import coordinates.Coordinates;
import game.Game;
import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Enter Player1 Details:");
        Player p1=new Player();
        p1.setPlayerFromInput(p1);
        p1.getPlayerDetails();
        System.out.println("Enter Player2 Details:");
        Player p2=new Player();
        p2.setPlayerFromInput(p2);
        p2.getPlayerDetails();
        HashMap<String,Jumper> map=new HashMap<>();
        map.put("6",new Jumper(new Coordinates(9,5),new Coordinates(6, 6)));
        map.put("97",new Jumper(new Coordinates(0,1),new Coordinates(9, 9)));
        map.put("21",new Jumper(new Coordinates(7,0),new Coordinates(0, 9)));
        map.put("64",new Jumper(new Coordinates(3,3),new Coordinates(7, 4)));
        Board b=new Board(10,map);
        b.printBoard();
        Game game=new Game(b,new Player[]{p1,p2},new Dice());
        game.play();
        
    }
}
