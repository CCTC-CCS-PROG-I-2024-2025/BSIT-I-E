import java.util.Scanner;

public class ZEPEDA_FINAL {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        System.out.println("My Final Project!");

        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); 

        System.out.print("Enter your age: ");
        int age = scanner.nextInt(); 

        System.out.println("Hello, " + name + "! Your age is " + age);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Ask user to choose an operation
        System.out.println("Choose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");

        int choice = scanner.nextInt(); // Get the user's choice

        switch (choice) {
            case 1:
                System.out.println("Addition: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Subtraction: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Multiplication: " + (num1 * num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("Division: " + (num1 / num2));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            case 5:
                System.out.println("Modulus: " + (num1 % num2));
                break;
            default:
                System.out.println("Invalid choice. Please choose a number between 1 and 5.");
                break;
        }

        if (age >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a minor.");
        }

        System.out.print("Enter a floating-point number: ");
        float floatNumber = scanner.nextFloat();

        System.out.print("Enter another floating-point number: ");
        float anotherFloat = scanner.nextFloat();

        System.out.println("Addition of floats: " + (floatNumber + anotherFloat));

        System.out.println("Enter a number to display numbers from 1 to your number:");
        int limit = scanner.nextInt();

        System.out.println("For Loop:");
        for (int i = 1; i <= limit; i++) {
            System.out.println(i);
        }

        scanner.close();
    }
}
