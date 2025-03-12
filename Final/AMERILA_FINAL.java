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
                System.out.println("Invalid operator.");
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
                System.out.println("Invalid array operation.");
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
        System.out.print("Choose an option: ");
        int choice = scanner.nextInt();

        while (choice != 3) {
            switch (choice) {
                case 1: 
                    System.out.print("Enter first number: ");
                    number1 = scanner.nextDouble();
                    System.out.print("Enter an operator (+, -, *, /): ");
                    operator = scanner.next().charAt(0);
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

                    System.out.print("Choose array operation ('s' for sum, 'm' for multiplication): ");
                    char arrayOperation = scanner.next().charAt(0);

                    processArray(array, arrayOperation);
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

            System.out.println("\n1. Basic Arithmetic Operations");
            System.out.println("2. Work with Arrays");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
        }

        System.out.println("Thank you for using the Advanced Calculator. Goodbye!");
        scanner.close();
    }
}
