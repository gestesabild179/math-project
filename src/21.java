import java.util.Scanner;

public class MathProject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入两个整数: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int sum = a + b;
        int difference = a - b;
        long product = a * b;
        double quotient = (double) a / b;

        if (difference < 0) {
            System.out.println("差为负数");
        } else {
            System.out.println("差为正数");
        }
        
        System.out.println("相加后的结果是: " + sum);
        System.out.println("相减后的结果是: " + difference);
        System.out.println("乘积是: " + product);
        System.out.println("除法是: " + quotient);
    }
}
