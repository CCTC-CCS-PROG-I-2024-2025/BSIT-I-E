import java.util.Scanner;

class MANIJAS_FINAL {

    public static void main(String[] args) {

        int age, number1, number2;
        double result;
        String name;
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to My Final Project!");

        System.out.print("Enter your name: ");
        name = sc.nextLine();

        System.out.print("Enter your age: ");
        age = sc.nextInt();

        if (age >= 18) {
            System.out.println(name + ", you are eligible to vote.");
        } else {
            System.out.println(name + ", you are not eligible to vote.");
        }

        System.out.print("Enter the first number: ");
        number1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        number2 = sc.nextInt();

        result = number1 + number2;
        System.out.println("Addition result: " + result);

        result = number1 - number2;
        System.out.println("Subtraction result: " + result);

        result = number1 * number2;
        System.out.println("Multiplication result: " + result);

        if (number2 != 0) {
            result = (double) number1 / number2;
            System.out.println("Division result: " + result);
        } else {
            System.out.println("Cannot divide by zero!");
        }

        System.out.println("\nChoose a number for a specific operation:");
        System.out.println("1. Calculate Square");
        System.out.println("2. Calculate Cube");
        System.out.println("3. Exit");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter a number to calculate the square: ");
                int number = sc.nextInt();
                System.out.println("Square of " + number + " is " + (number * number));
                break;
            case 2:
                System.out.print("Enter a number to calculate the cube: ");
                number = sc.nextInt();
                System.out.println("Cube of " + number + " is " + (number * number * number));
                break;
            case 3:
                System.out.println("Exiting the program.");
                break;
            default:
                System.out.println("Invalid choice! Please enter a valid option.");
        }

        System.out.println("\nUsing a while loop to print numbers from 1 to 5:");
        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }

        System.out.println("\nUsing a for loop to calculate the sum of numbers from 1 to 10:");
        int sum = 0;
        for (int j = 1; j <= 10; j++) {
            sum += j;
        }
        System.out.println("Sum of numbers from 1 to 10 is: " + sum);

        System.out.println("\nChecking if the first number is greater than 0 and less than 100:");
        if (number1 > 0 && number1 < 100) {
            System.out.println(number1 + " is within the valid range (0 - 100).");
        } else {
            System.out.println(number1 + " is outside the valid range (0 - 100).");
        }
    }
}