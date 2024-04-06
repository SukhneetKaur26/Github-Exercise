// Calculator.java
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Addition addition = new Addition();

        System.out.println("Welcome to Calculator!");
        System.out.println("Enter two numbers to add:");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double result = addition.add(num1, num2);
        System.out.println("Result: " + result);

        scanner.close();
    }
}

class Addition {
    public double add(double num1, double num2) {
        return num1 + num2;
    }
}
