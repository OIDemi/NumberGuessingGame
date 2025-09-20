import java.util.Random;

public class Main{
    public static void main(String[] args) {
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator(new Random());
        GameLogic gameLogic = new GameLogic(randomNumberGenerator);
        ConsoleUI consoleUI = new ConsoleUI(gameLogic);

        consoleUI.welcomeMessage();
        consoleUI.gameMenu();
        consoleUI.guessNumber();
        consoleUI.end();
    }
}