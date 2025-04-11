public class MathProject {
    public static void main(String[] args) {
        int sum = 0;
        double product = 1.0;

        System.out.println("Calculating...");
        sum += 5;
        product *= 2;

        if (sum > product) {
            System.out.println("Sum is greater than the product.");
        } else {
            System.out.println("Sum is not greater than the product.");
        }
    }
}
