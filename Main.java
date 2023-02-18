import java.util.Scanner;

public class Main {


    public static void Main(String[] args) {
        Player player1 = new Player();
        Player player2 = new Player();


        // ask who want to be white?
        Scanner console = new Scanner(System.in);
        System.out.println("who want to be the white side? p1 or p2? ");
        String input = console.next();
        if (input.equals("p1")) {
            player1.setIsWhite(true);
        } else {
            player2.setIsWhite(true);
        }

        Game game = new Game(player1, player2);
        game.start();

    }
}
