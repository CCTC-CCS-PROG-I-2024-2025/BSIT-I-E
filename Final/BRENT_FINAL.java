import java.util.Scanner;

public class BoilingAndCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Boiling Water Simulation and Basic Calculator!");

        // User enters a message (String input)
        System.out.print("\nEnter a custom message: ");
        scanner.nextLine(); // Consume newline left by previous input
        String customMessage = scanner.nextLine();
        System.out.println("Your message: " + customMessage);

        // Boiling Water Simulation
        System.out.println("\nBoiling Water Simulation:");
        System.out.println("We will simulate water heating up to 100°C (boiling point).");

        for (int temp = 0; temp <= 100; temp += 10) {
            if (temp == 100) {
                System.out.println("Water has reached boiling point at " + temp + "°C!");
            } else {
                System.out.println("Heating water... Current temperature: " + temp + "°C");
            }
        }

        // Simple Calculator Using Loops
        System.out.println("\n--- Basic Calculator ---");
        char choice;
        do {
            System.out.print("\nEnter first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();

            System.out.println("Select an operation:");
            System.out.println("[+] Addition");
            System.out.println("[-] Subtraction");
            System.out.println("[*] Multiplication");
            System.out.println("[/] Division");
            System.out.println("[%] Modulus");

            System.out.print("Enter operation symbol (+, -, *, /, %): ");
            char operator = scanner.next().charAt(0);

            switch (operator) {
                case '+':
                    System.out.println("Result: " + (num1 + num2));
                    break;
                case '-':
                    System.out.println("Result: " + (num1 - num2));
                    break;
                case '*':
                    System.out.println("Result: " + (num1 * num2));
                    break;
                case '/':
                    if (num2 != 0) {
                        System.out.println("Result: " + (num1 / num2));
                    } else {
                        System.out.println("Division by zero is not allowed.");
                    }
                    break;
                case '%':
                    if (num2 != 0) {
                        System.out.println("Result: " + (num1 % num2));
                    } else {
                        System.out.println("Modulus by zero is not allowed.");
                    }
                    break;
                default:
                    System.out.println("Invalid operation symbol.");
            }

            System.out.print("\nDo you want to perform another calculation? (Sir): ");
            choice = scanner.next().charAt(0);

        } while (choice == 'Y' || choice == 'y');

        System.out.println("\nThank you for using the program. Goodbye!");
        scanner.close();
    }
}
