import java.util.Scanner;

public class NUEVA_FINALS {

    
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

       
        System.out.println("Welcome to Java Basics!");

       
        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); 

        System.out.print("Enter your age: ");
        int age = scanner.nextInt(); 

        System.out.println("Hello, " + name + "! Your age is " + age);

      
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Addition: " + (num1 + num2));
        System.out.println("Subtraction: " + (num1 - num2));
        System.out.println("Multiplication: " + (num1 * num2));
        System.out.println("Division: " + (num1 / num2));
        System.out.println("Modulus: " + (num1 % num2));

        
        if (age >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a minor.");
        }

                System.out.println("Enter a number to display numbers from 1 to your number:");
        int limit = scanner.nextInt();

        System.out.println("For Loop:");
        for (int i = 1; i <= limit; i++) {
            System.out.println(i);
        }

        
        System.out.println("While Loop:");
        int count = 1;
        while (count <= limit) {
            System.out.println(count);
            count++;
        }

        
        System.out.println("Do-While Loop:");
        int number = 1;
        do {
            System.out.println(number);
            number++;
        } while (number <= limit);

       
        scanner.close();
    }
}
