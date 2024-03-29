import board.Board;
import player.Player;
import java.util.Scanner;
import game.Game;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Tic-Tac-Toe");
        Board b = new Board(3, '-');
        // b.printBoardConfig();
        Scanner scan = new Scanner(System.in);
        System.out.println("Details of Player-1");
        System.out.print("Name: ");
        String n = scan.nextLine();
        System.out.print("Symbol: ");
        char s1 = scan.nextLine().charAt(0);
        System.out.println("-----------------------------");
        System.out.println("Details of Player-2");
        System.out.print("Name: ");
        String m = scan.nextLine();
        System.out.print("Symbol: ");
        char s2 = scan.nextLine().charAt(0);
        Player p1 = new Player();
        Player p2 = new Player();

        p1.setPlayerNameandSymbol(n, s1);
        p2.setPlayerNameandSymbol(m, s2);
        // System.out.println("Details of player-1");
        // System.out.println("Name: " + p1.getPlayerName());
        // System.out.println("Name: " + p1.getPlayerSymbol());
        // System.out.println("-----------------------------");
        // System.out.println("Details of player-2");
        // System.out.println("Name: " + p2.getPlayerName());
        // System.out.println("Name: " + p2.getPlayerSymbol());

        Game game = new Game(new Player[] { p1, p2 }, b);
        game.play();

    }
}
