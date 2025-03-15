import java.util.Random;

public class MathProject {
    public static void main(String[] args) {
        Random rand = new Random();
        int num1 = rand.nextInt(20);
        int num2 = rand.nextInt(20);
        System.out.println("Random numbers: " + num1 + ", " + num2);
        if (num1 > num2) {
            System.out.println("The first number is greater than the second number.");
        } else if (num1 < num2) {
            System.out.println("The first number is less than the second number.");
        } else {
            System.out.println("The two numbers are equal.");
        }
    }
}
