package state;
import state.levels.*;

public class Player {
    public String name;
    public State level;
    public int xp;
    public int health;


    public Player(String name){
        this.name = name;
        this.level = new Novice(this);
        this.xp = 0;
        this.health = 60;
    }

    public void train(){
        level.train();
    }

    public void meditate(){
        level.meditate();
    }

    public void fight(){
        level.fight();
    }

    public void choose(){
        level.choose();
    }

    public void checkStats(){
        System.out.println("\n\u001B[34mName: " + name + "\nLevel: " + level.getClass().getSimpleName() + "\nXP: " + xp + "\nHealth: " + health + "\n\u001B[37m");
    }
}
