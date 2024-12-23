import java.util.Scanner;

public class APOSTRO_FINALS {


    static final double PI = 2.14159; 
    static Scanner scanner = new Scanner(System.in); 

    public static void main(String[] args) {
        System.out.println("===Java Program ===);

        
        int age = 25;             
        double height = 5.9;     
        char grade = 'A';         
        boolean isStudent = true; 


        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Grade: " + grade);
        System.out.println("Is student: " + isStudent
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Welcome, " + name + "!");

        
        int roundedHeight = (int) height; 
        System.out.println("Rounded Height (int): " + roundedHeight);

        int num1 = 15, num2 = 7;
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        double quotient = (double) num1 / num2;

        System.out.println("Arithmetic Operations:");
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);

        
        System.out.println("Value of PI: " + PI);

        System.out.print("Enter your age: ");
        int userAge = scanner.nextInt();
        if (userAge >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }
        System.out.println("\nChoose a meal option (1-3):");
        System.out.println("1. Burger\n2. Pizza\n3. Salad");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("You chose Burger.");
                break;
            case 2:
                System.out.println("You chose Pizza.");
                break;
            case 3:
                System.out.println("You chose Salad.");
                break;
            default:
                System.out.println("Invalid choice.");
        }
        System.out.println("\nCounting from 1 to 10 using loops:");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Countdown:");
        int countdown = 5;
        while (countdown > 0) {
            System.out.println("T-minus " + countdown);
            countdown--;
        }
        System.out.println("Liftoff!");

        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("Array Elements (Single-dimensional):");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        String[][] students = {
            {"Alice", "Bob"},
            {"Charlie", "Diana"},
            {"Eve", "Frank"}
        };

        System.out.println("\nMulti-dimensional Array (Student Names):");
        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < students[i].length; j++) {
                System.out.print(students[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nEnter 5 numbers to populate an array:");
        int[] userNumbers = new int[5];
        for (int i = 0; i < userNumbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            userNumbers[i] = scanner.nextInt();
        }

        System.out.println("You entered:");
        for (int num : userNumbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        greetUser(name);

        APOSTRO_FINALS java = new APOSTRO_FINALS();
        java.displayMessage("Instance Method Example!");

      
        System.out.print("\nEnter two numbers to add: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int additionResult = add(a, b);
        System.out.println("Addition result: " + additionResult);

        int maxNumber = findMax(userNumbers);
        System.out.println("The maximum number in your array is: " + maxNumber);
        System.out.println("Multiplying 5 and 3: " + multiply(5, 3));
        System.out.println("Multiplying 4.5 and 2.2: " + multiply(4.5, 2.2));

        scanner.close();
    }

    public static void greetUser(String userName) {
        System.out.println("Hello, " + userName + "! Welcome to the Java program.");
    }

   
    public void displayMessage(String message) {
        System.out.println(message);
    }

    public static int add(int x, int y) {
        return x + y;
    }
    public static int findMax(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
    public static int multiply(int a, int b) {
        return a * b;
    }
    public static double multiply(double a, double b) {
        return a * b;
    }
}
