package state.levels;
import state.Player;
import state.State;

public class Expert extends State {

    public Expert(Player player){
        super(player, 50);
    }

    public void train() {
        player.xp+=10;
        if (player.xp >= xpToLevelUp){
            player.level = new Master(player);
            System.out.println("\u001B[33mYou have leveled up to Master!\u001B[37m\n");
        }else{
            System.out.println("Expert trains intensely.\n");
        }
    }

    @Override
    public void meditate() {
        player.health+=10;
        if (player.health > 60) player.health = 60;
        System.out.println("Expert meditates to recover health. Health is now: " + player.health + "\n");
    }

    public void fight() {
        player.health-=15;
        if (player.health <= 0) {
            player.level = new Novice(player);
            player.health = 1;
            player.xp = 0;
            System.out.println("You have been knocked out and reverted to Novice!");
        }else{
            player.xp+=20;
            System.out.println("Expert fights with skill but loses some health. Health is now: " + player.health);
            if (player.xp >= xpToLevelUp){
                player.level = new Master(player);
                System.out.println("\u001B[33mYou have leveled up to Master!\u001B[37m");
            }
        }
    }
}