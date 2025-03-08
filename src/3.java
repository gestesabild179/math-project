import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int randNum = new Random().nextInt(50) + 1;
        System.out.println("The random number is " + randNum);
    }
}
