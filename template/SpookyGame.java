package template;
import java.util.Scanner;

public class SpookyGame extends Game{

    int[] playerScores;
    Scanner scanner = new Scanner(System.in);
    int totalTurns;

    @Override
    public void initializeGame(int numberOfPlayers) {
        playerScores = new int[numberOfPlayers];
        for (int i = numberOfPlayers; i > 0; i--){
            playerScores[i-1] = 0;
        }
        totalTurns = numberOfPlayers * 3;
    }

    @Override
    public boolean endOfGame() {
        return totalTurns <= 0;
    }

    @Override
    public void playSingleTurn(int player) {
        System.out.println("""
                Player %d's turn.
                Do you want to run or hide from the monster?
                1: run
                2: hide
                """.formatted(player+1));
        switch (scanner.nextInt()){
            case 1 -> run(player);
            case 2 -> hide(player);
            default -> System.out.println("Invalid choice, you lose your turn!");
        }
        totalTurns--;
    }
    
    @Override
    public void displayWinner() {
        int index=0;
        int highScore=0;
        int highScorePlayersIndex=0;
        boolean tie = false;

        for (int i : playerScores){
            if(i>highScore && i>0){
                highScore = i;
                highScorePlayersIndex = index;
                tie = false;
            }else if(i == highScore){
                tie = true;
            }
            index++;
        }
        if(!tie && highScore>0){
            System.out.println("Player " + (highScorePlayersIndex+1) + " wins with " + highScore + " points! Congratulations!");
        }else{
            System.out.println("Everybody loses!");
        }
        scanner.close();
    }

    public void run(int player){
        if(Math.random()>0.5){
            playerScores[player]++;
            System.out.println("\u001B[32m Player " + (player+1) + " managed to escape the monster! They get 1 point. They now have " + (playerScores[player]) + " points. \u001B[37m");
        }else{
            playerScores[player]--;
            System.out.println("\u001B[31m Player " + (player+1) + " was caught by the monster! They lose 1 point. They now have " + (playerScores[player]) + " points. \u001B[37m");
        }
    }

    public void hide(int player){
        System.out.println("\u001B[33m Player " + (player+1) + " is hiding from the monster... shhh! They now have " + (playerScores[player]) + " points. \u001B[37m");
    }
}