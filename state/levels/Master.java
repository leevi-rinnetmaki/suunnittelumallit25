package state.levels;
import state.Player;
import state.State;

public class Master extends State {

    public Master(Player player) {
        super(player, 100);
    }

    public void train() {
        System.out.println("You are already a master. The game should already ended. You shouldn't even be able to train anymore.");
    }

    public void meditate() {
        System.out.println("You are already a master. The game should already ended. You shouldn't even be able to meditate anymore.");
    }

    public void fight() {
        System.out.println("You are already a master. The game should already ended. You shouldn't even be able to fight anymore.");
    }
}