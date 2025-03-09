import java.util.Scanner;
public class MathProject {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int sum = add(num1, num2);
		System.out.println("Sum: " + sum);
	}
	public static int add(int a, int b) {
		return a + b;
	}
}