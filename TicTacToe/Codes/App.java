import board.Board;
import player.Player;
import game.Game;
public class App {

    public static void main(String[] args) {
        Board b=new Board(3,'-');
        Player p1=new Player();
        Player p2=new Player();
        p1.setPlayerDetails("Pranitha", 'X', "Old bowenpally", "6303651378", "pranithareddy@gmail.com",18);
        p2.setPlayerDetails("Akshaya", 'O', "Hyderabad", "9989446109", "akshaya@gmail.com", 14);
        Game game=new Game(new Player[]{p1,p2},b);
        game.play();
    }
}
