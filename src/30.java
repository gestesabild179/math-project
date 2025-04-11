import java.util.Random;

public class MathProject {
    public static void main(String[] args) {
        // Example random numbers between 1 and 100
        Random rand = new Random();
        int num1 = rand.nextInt(100) + 1;
        int num2 = rand.nextInt(100) + 1;

        System.out.println("Random numbers: " + num1 + " and " + num2);
    }
}
