public class MathProject {
    public static void main(String[] args) {
        int sum = 0;
        double product = 1.0;

        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0)
                product *= i;
            else
                sum += i;
        }

        System.out.println("Sum of even numbers: " + sum);
        System.out.println("Product of all numbers: " + product);
    }
}
