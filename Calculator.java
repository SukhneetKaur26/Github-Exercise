// Calculator.java
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Multiplication multiplication = new Multiplication();

        System.out.println("Welcome to Calculator!");
        System.out.println("Enter two numbers to multiply:");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double result = multiplication.multiply(num1, num2);
        System.out.println("Result: " + result);

        scanner.close();
    }
}

class Multiplication {
    public double multiply(double num1, double num2) {
        return num1 * num2;
    }
}
