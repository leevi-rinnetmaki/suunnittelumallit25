package template;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of players: ");
        int numberOfPlayers = scanner.nextInt();
        Game game = new SpookyGame();
        game.play(numberOfPlayers);
        scanner.close();

    }
}
