import java.util.Scanner;

public class PARDILLO_FINAL { 

    // Function to display a greeting message
    public static void greetUser(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // Function to calculate the year when the user will turn 100 years old
    public static void yearToTurn100(int age) {
        int currentYear = 2024;
        int yearsTo100 = 100 - age;
        int yearOf100 = currentYear + yearsTo100;
        System.out.println("You will turn 100 years old in the year: " + yearOf100);
    }

    // Function to calculate the BMI (Body Mass Index)
    public static void calculateBMI(double height, double weight) {
        if (height == 0) {  // Prevent division by zero
            System.out.println("Height cannot be zero.");
            return;
        }

        double bmi = weight / (height * height);
        System.out.println("Your BMI is: " + bmi);
        
        if (bmi < 18.5) {
            System.out.println("You are underweight.");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("You have a normal weight.");
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("You are overweight.");
        } else {
            System.out.println("You are obese.");
        }
    }

    // Function to check if the user's age is even or odd
    public static void checkAgeType(int age) {
        if (age % 2 == 0) {
            System.out.println("Your age is even.");
        } else {
            System.out.println("Your age is odd.");
        }
    }

    // Main function to interact with the user and get input
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for user's name
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();

        // Ask for user's age
        System.out.print("Please enter your age: ");
        int age = scanner.nextInt();

        // Ask for user's height in meters
        System.out.print("Please enter your height (in meters): ");
        double height = scanner.nextDouble();

        // Ask for user's weight in kilograms for BMI calculation
        System.out.print("Please enter your weight (in kilograms): ");
        double weight = scanner.nextDouble();

        // Call functions using the provided inputs
        greetUser(name);
        yearToTurn100(age);
        calculateBMI(height, weight);
        checkAgeType(age);
        
        scanner.close(); // Close the scanner
    }
}
