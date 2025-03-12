import java.util.Scanner;

public class AdvancedCalculator {

    public static double calculate(double num1, double num2, char operator) {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    System.out.println("Error: Division by zero.");
                    return Double.NaN;
                }
            default:
                System.out.println("Error: Invalid operator.");
                return Double.NaN;
        }
    }

    public static void processArray(int[] arr, char operation) {
        switch (operation) {
            case 's':
                int sum = 0;
                for (int num : arr) {
                    sum += num;
                }
                System.out.println("Sum of elements: " + sum);
                break;
            case 'm':
                int product = 1;
                for (int num : arr) {
                    product *= num;
                }
                System.out.println("Product of elements: " + product);
                break;
            default:
                System.out.println("Error: Invalid array operation.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number1, number2;
        char operator;

        System.out.println("Welcome to the Advanced Calculator!");
        System.out.println("1. Basic Arithmetic Operations");
        System.out.println("2. Work with Arrays");
        System.out.println("3. Exit");

        while (true) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter first number: ");
                    number1 = scanner.nextDouble();

                    while (true) {
                        System.out.print("Enter an operator (+, -, *, /): ");
                        operator = scanner.next().charAt(0);
                        if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {
                            break;
                        } else {
                            System.out.println("Invalid operator. Please enter one of (+, -, *, /).");
                        }
                    }

                    System.out.print("Enter second number: ");
                    number2 = scanner.nextDouble();

                    double result = calculate(number1, number2, operator);
                    System.out.println("Result: " + result);
                    break;

                case 2:
                    System.out.print("Enter the size of the array: ");
                    int size = scanner.nextInt();
                    int[] array = new int[size];

                    System.out.println("Enter " + size + " integers:");
                    for (int i = 0; i < size; i++) {
                        array[i] = scanner.nextInt();
                    }

                    while (true) {
                        System.out.print("Choose array operation ('s' for sum, 'm' for multiplication): ");
                        char arrayOperation = scanner.next().charAt(0);
                        if (arrayOperation == 's' || arrayOperation == 'm') {
                            processArray(array, arrayOperation);
                            break;
                        } else {
                            System.out.println("Invalid operation. Please choose either 's' for sum or 'm' for multiplication.");
                        }
                    }
                    break;

                case 3:
                    System.out.println("Thank you for using the Advanced Calculator. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.println("\n1. Basic Arithmetic Operations");
            System.out.println("2. Work with Arrays");
            System.out.println("3. Exit");
        }
    }
}
