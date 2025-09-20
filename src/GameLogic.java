public class GameLogic {
    private int noOfChances;
    private RandomNumberGenerator randomNumberGenerator;
    public GameLogic(RandomNumberGenerator randomNumberGenerator){
        this.randomNumberGenerator = randomNumberGenerator;
    }


    public void setNoOfChances(int noOfChances) {
        this.noOfChances = noOfChances;
    }

    public int getNoOfChances() {
        return noOfChances;
    }

    public boolean isNumberCorrect(int userOption) {
        return userOption == randomNumberGenerator.getCorrectGeneratedNumber();
    }
}
