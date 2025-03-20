import java.util.Random;

public class MathProject {
    public static int getRandomNumber(int min, int max) {
        Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;
    }
}
