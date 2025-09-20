import java.util.Random;

public class RandomNumberGenerator {
    private final Random random;
    private final int correctGeneratedNumber;
    public RandomNumberGenerator(Random random){
        this.random = random;
        correctGeneratedNumber = random.nextInt(1,101);
    }

    public int getCorrectGeneratedNumber() {
        return correctGeneratedNumber;
    }
}
