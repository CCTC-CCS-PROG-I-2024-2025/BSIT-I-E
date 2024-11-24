import java.util.Scanner;

public class CABALLERO_ACTIVITY_IV {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt();
        
        int factorial = 1;
        
        if (number >= 0) {
         
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            System.out.println("Factorial of " + number + " is: " + factorial);
        } else {
            System.out.println("Please enter a non-negative integer.");
        }
    }
}
