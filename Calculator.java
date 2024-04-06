// Calculator.java
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Calculator!");
        System.out.println("Choose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                Addition addition = new Addition();
                addition.performOperation();
                break;
            case 2:
                Subtraction subtraction = new Subtraction();
                subtraction.performOperation();
                break;
            case 3:
                Multiplication multiplication = new Multiplication();
                multiplication.performOperation();
                break;
            default:
                System.out.println("Invalid choice!");
        }

    
    }
}

        Addition addition = new Addition();

       
        System.out.println("Enter two numbers to add:");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double result = addition.add(num1, num2);
        System.out.println("Result: " + result);

        scanner.close();
    


class Addition {
    public double add(double num1, double num2) {
        return num1 + num2;
    }
}
