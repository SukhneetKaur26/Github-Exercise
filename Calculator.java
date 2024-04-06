// Calculator.java
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Subtraction subtraction = new Subtraction();

        System.out.println("Welcome to Calculator!");
        System.out.println("Enter two numbers to subtract:");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double result = subtraction.subtract(num1, num2);
        System.out.println("Result: " + result);

        scanner.close();
    }
}

class Subtraction {
    public double subtract(double num1, double num2) {
        return num1 - num2;
    }
}
