public class GameLogic {
    private int noOfChances;
    private final RandomNumberGenerator randomNumberGenerator;
    private int noOfAttempts;
    public GameLogic(RandomNumberGenerator randomNumberGenerator){
        this.randomNumberGenerator = randomNumberGenerator;
    }


    public void setNoOfChances(int noOfChances) {
        this.noOfChances = noOfChances;
    }

    public int getNoOfChances() {
        return noOfChances;
    }

    public int getNoOfAttempts() {
        return noOfAttempts;
    }

    public boolean isGameOver(){
        return noOfChances > 0;
    }
    public boolean isGuessCorrect(int userOption) {
        noOfChances--;
        noOfAttempts++;
        return userOption == randomNumberGenerator.getCorrectGeneratedNumber();
    }
}
