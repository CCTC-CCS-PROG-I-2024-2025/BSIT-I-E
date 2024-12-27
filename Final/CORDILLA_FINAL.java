import java.util.Scanner;

public class CORDILLA_FINAL {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Factorial Calculator!");

       
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

       
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

      
        System.out.println("Hello, " + name + "! Your age is " + age);

       
        System.out.print("Enter a number to calculate its factorial: ");
        int number = scanner.nextInt();

       
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i; // Multiply each number
        }
        System.out.println("The factorial of " + number + " is " + factorial);
        if (age >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a minor.");
        }
        scanner.close();
    }
}