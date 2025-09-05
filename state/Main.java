package state;
import java.util.Scanner;
import state.levels.*;
public class Main {

    public String name;
    public Player player;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your character's name: ");
        String name = scanner.nextLine();
        Player player = new Player(name);

        while((player.level instanceof Master)==false){
            player.choose();
        }
        System.out.println("You win!");
    }
    
}
