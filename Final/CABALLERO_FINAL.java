import java.util.Scanner;

public class Calculator {

    // Method to display the menu
    public static void displayMenu() {
        System.out.println("Simple Calculator");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exit");
        System.out.print("Choose an operation (1-5): ");
    }

    // Method to perform addition
    public static double add(double a, double b) {
        return a + b;
    }

    // Method to perform subtraction
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Method to perform multiplication
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Method to perform division
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0; // Returning 0 for division by zero scenario
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        double num1, num2;

        do {
            displayMenu();
            choice = scanner.nextInt();

            // Check if the user wants to exit
            if (choice == 5) {
                System.out.println("Exiting the calculator. Goodbye!");
                break;
            }

            // Taking user input for the numbers
            System.out.print("Enter first number: ");
            num1 = scanner.nextDouble();
            System.out.print("Enter second number: ");
            num2 = scanner.nextDouble();

            // Using switch statement for operation selection
            switch (choice) {
                case 1:
                    System.out.println("Result: " + add(num1, num2));
                    break;
                case 2:
                    System.out.println("Result: " + subtract(num1, num2));
                    break;
                case 3:
                    System.out.println("Result: " + multiply(num1, num2));
                    break;
                case 4:
                    System.out.println("Result: " + divide(num1, num2));
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a valid operation.");
            }

            System.out.println(); // Print a new line for better readability

        } while (true); // Loop until the user decides to exit

        scanner.close(); // Close the scanner
    }
}
