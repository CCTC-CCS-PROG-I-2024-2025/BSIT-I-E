import java.util.Scanner;

public class FitnessChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Input age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Determine if minor or adult
        String ageCategory = (age < 18) ? "Minor" : "Adult";

        // Input height in meters
        System.out.print("Enter your height in meters (e.g., 1.75): ");
        double height = scanner.nextDouble();

        // Input weight in kilograms
        System.out.print("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble();

        // Calculate BMI
        double bmi = weight / (height * height);

        // Determine fitness based on BMI
        String fitnessCategory;
        if (bmi < 18.5) {
            fitnessCategory = "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            fitnessCategory = "Normal (Physically Fit)";
        } else if (bmi >= 25 && bmi <= 29.9) {
            fitnessCategory = "Overweight";
        } else {
            fitnessCategory = "Obese";
        }

        // Output results
        System.out.println("\n--- Results ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " (" + ageCategory + ")");
        System.out.println("Height: " + height + " meters");
        System.out.println("Weight: " + weight + " kilograms");
        System.out.printf("BMI: %.2f (%s)%n", bmi, fitnessCategory);

        // Close scanner
        scanner.close();
    }
}
