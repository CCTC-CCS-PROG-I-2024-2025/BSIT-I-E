import java.util.Scanner;

public class CANUMAY_ACTIVITY_IV {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt();
        
        if (number < 0) {
            System.out.println("Please enter a non-negative integer.");
        } elses {
            int factorial = 1;
            
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            System.out.println("Factorial of " + number + " is: " + factorial);
        }
        
        scanner.close();
    }
}
