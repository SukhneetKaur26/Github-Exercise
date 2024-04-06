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
        double result = 0.0;
        switch (choice) {
            case 1:
                Addition addition = new Addition();
                result = addition.performOperation(scanner);
                break;
            case 2:
                Subtraction subtraction = new Subtraction();
                result = subtraction.performOperation(scanner);
                break;
            case 3:
                Multiplication multiplication = new Multiplication();
                result = multiplication.performOperation(scanner);
                break;
            default:
                System.out.println("Invalid choice!");
        }

        System.out.println("Result: " + result);

        scanner.close();
    }
}

class Addition {
    public double performOperation(Scanner scanner) {
        System.out.println("Enter two numbers to add:");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        return num1 + num2;
    }
}

class Subtraction {
    public double performOperation(Scanner scanner) {
        System.out.println("Enter two numbers to subtract:");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        return num1 - num2;
    }
}

class Multiplication {
    public double performOperation(Scanner scanner) {
        System.out.println("Enter two numbers to multiply:");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        return num1 * num2;
    }
}
