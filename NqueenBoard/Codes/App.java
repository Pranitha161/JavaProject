import player.Player;
import java.util.*;
import board.Nqueenboard;
import game.Nqueen;
public class App {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Player Details:");
        Player p=new Player();
        p.setPlayerFromInput(p);
        p.getPlayerDetails();
        System.out.println("Enter size of board:");
        Nqueenboard b=new Nqueenboard(sc.nextInt());
        Nqueen g=new Nqueen(b);
        System.out.println("All possible queen Positions:");
        g.play();
    }
}
