package state;
import java.util.Scanner;

public abstract class State {
    public Scanner scanner;
    public Player player;
    public int xpToLevelUp;
    public abstract void train();
    public abstract void meditate();
    public abstract void fight();

    public void choose() {
        System.out.println("""
                           \n\u001B[32mChoose your next action:
                           1:train
                           2:meditate
                           3:fight
                           4:check stats\u001B[0m""");
        switch (scanner.nextLine()){
            case "1" -> train();
            case "2" -> meditate();
            case "3" -> fight();
            case "4" -> player.checkStats();
        }
    }

    public State(Player player, int xpToLevelUp) {
        this.player = player;
        this.xpToLevelUp = xpToLevelUp;
        this.scanner = new Scanner(System.in);
    }
}