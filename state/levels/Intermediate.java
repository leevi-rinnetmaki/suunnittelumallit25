package state.levels;
import state.Player;
import state.State;

public class Intermediate extends State {

    public Intermediate(Player player){
        super(player, 100);
    }

    @Override
    public void train() {
        player.xp+=8;
        if (player.xp >= xpToLevelUp){
            player.level = new Expert(player);
            System.out.println("\u001B[33mYou have leveled up to Expert!\u001B[37m\n");
        }else{
            System.out.println("Intermediate trains moderately.\n");
        }
    }

    @Override
    public void meditate() {
        player.health+=10;
        if (player.health > 60) player.health = 60;
        System.out.println("Intermediate meditates to recover health. Health is now: " + player.health + "\n");
    }

    @Override
    public void fight() {
        System.out.println("You are not skilled enough to fight properly.");
    }
}