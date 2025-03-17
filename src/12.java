import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        Random rnd = new Random();
        int randomInt = rnd.nextInt(10);
        System.out.println("The random number is: " + randomInt);
    }
}