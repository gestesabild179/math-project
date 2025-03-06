public class MathProject {
    public static void main(String[] args) {
        double x = 0;
        int n = 1;
        while (n < 100) {
            x += (Math.random() - 0.5) / 10;
            System.out.println("x = " + x);
            n++;
        }
    }
}
