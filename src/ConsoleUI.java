import java.util.Scanner;

public class ConsoleUI {
    private GameLogic gameLogic;
    private Scanner scanner;
    private int noOfAttempts;
    private int noOfChances;
    public ConsoleUI(GameLogic gameLogic){
        this.gameLogic = gameLogic;
        this.scanner = new Scanner(System.in);
    }
    public void welcomeMessage(){
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");
    }

    public void gameMenu(){
        boolean isValidDifficulty = false;
        while(!isValidDifficulty){
            System.out.println("Please select the difficulty level");
            System.out.println("1. Easy (10 chances)");
            System.out.println("2. Medium (5 chances)");
            System.out.println("3. Hard (3 chances)");

            String userOption = scanner.nextLine();
            switch(userOption){
                case "1":
                   difficultyLevelChosen("Easy");
                    gameLogic.setNoOfChances(10);
                    isValidDifficulty = true;
                    break;
                case "2":
                    difficultyLevelChosen("Medium");
                    gameLogic.setNoOfChances(5);
                    isValidDifficulty = true;
                    break;
                case "3":
                    System.out.println("Hard");
                    gameLogic.setNoOfChances(3);
                    isValidDifficulty = true;
                    break;
                default:
                    System.out.println("Not a valid option, try again.");
                    break;
            }
        }
    }
    public void difficultyLevelChosen(String difficultyLevel){
        System.out.println("Great! You have selected the "+difficultyLevel+" difficulty level");
    }

    public void guessNumber(){
         this.noOfChances = gameLogic.getNoOfChances();
        int userGuess = 0;
        while(noOfChances > 0){
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            scanner.nextLine();
            if(gameLogic.isNumberCorrect(userGuess)){
                break;
            }else{
                System.out.println("Incorrect");
                this.noOfAttempts++;
                this.noOfChances--;
            }
        }
    }
    public void end(){
        if(this.noOfChances > 0)
            System.out.println("Congratulations! You guessed the correct number in 4 attempts.");
        else
            System.out.println("You lost");

        scanner.close();
    }
}
