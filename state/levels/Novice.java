package state.levels;
import state.Player;
import state.State;

public class Novice extends State {
    
    public Novice(Player player) {
        super(player, 12);
    }

    @Override
    public void train() {
        player.xp+=6;
        if (player.xp >= xpToLevelUp){
            player.level = new Intermediate(player);
            System.out.println("\u001B[33mYou have leveled up to Intermediate! You can now meditate!\u001B[37m\n");
        }else{
            System.out.println("Novice trains lightly.\n");
        }
    }

    @Override
    public void meditate() {
        System.out.println("You are too low level to meditate.\n");
    }
    
    @Override
    public void fight() {
        System.out.println("You are too low level to fight.\n");
    }
}