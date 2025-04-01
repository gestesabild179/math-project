public class MathProject {
    // Example of a mathematical operation
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    // Example of a mathematical function
    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    // Example of a mathematical equation
    public static double calculateEquation(double value1, double value2, String operation) {
        switch (operation) {
            case "+":
                return add(value1, value2);
            case "-":
                return subtract(value1, value2);
            case "*":
                return multiply(value1, value2);
            default:
                throw new IllegalArgumentException("Unsupported operation: " + operation);
        }
    }

    // Example of a method to perform an arithmetic calculation
    public static double performCalculation(double num1, double num2) {
        if (num1 == 0 || num2 == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return num1 / num2;
    }

    // Example of a method to check if a number is even
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
}
