import java.util.Random;

public class RandomNumberGenerator {
    private Random random;
    private int correctGeneratedNumber;
    public RandomNumberGenerator(Random random){
        this.random = random;
        correctGeneratedNumber = random.nextInt(1,101);
    }

    public int getCorrectGeneratedNumber() {
        return correctGeneratedNumber;
    }
}
