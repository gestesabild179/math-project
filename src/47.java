import java.util.Random;

public class MathProject {
    public static void main(String[] args) {
        int n = 10; // example value of n
        
        Random rand = new Random();
        double sum = 0;
        
        for (int i = 0; i < n; i++) {
            double x = rand.nextDouble() * 10; // generate random number between 0 and 10
            double y = rand.nextDouble() * 10; // generate random number between 0 and 10
            sum += x + y;
        }
        
        System.out.println("The sum of the points is: " + sum);
    }
}
