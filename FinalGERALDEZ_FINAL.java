import java.util.Scanner; // Import Scanner for user input

public class JavaLessonsExample2 {
    public static void main(String[] args) {
        // Variables
        Scanner scanner = new Scanner(System.in);
        boolean keepRunning = true;

        System.out.println("Welcome to the Java Quiz Game!\n");

        // While Loop to keep the program running until the user exits
        while (keepRunning) {
            // Program Structure: Display Menu
            System.out.println("Choose an option:");
            System.out.println("1. Start Quiz");
            System.out.println("2. View Instructions");
            System.out.println("3. Exit\n");

            // User Input
            System.out.print("Enter your choice (1-3): ");
            int choice = scanner.nextInt();

            // Switch Statement for Menu Options
            switch (choice) {
                case 1:
                    // Start Quiz
                    int score = 0;

                    // Question 1 (Conditionals)
                    System.out.println("Question 1: What is 5 + 3?");
                    System.out.println("a) 6\nb) 8\nc) 10");
                    System.out.print("Your answer: ");
                    char answer1 = scanner.next().charAt(0);

                    if (answer1 == 'b') {
                        score += 10; // Doing Math
                        System.out.println("Correct!\n");
                    } else {
                        System.out.println("Wrong! The correct answer is b) 8.\n");
                    }

                    // Question 2 (Multiple Conditions)
                    System.out.println("Question 2: Which of the following are Java keywords?\n1) class\n2) static\n3) if\n4) all of the above");
                    System.out.print("Your answer (enter 1, 2, 3, or 4): ");
                    int answer2 = scanner.nextInt();

                    if (answer2 == 4) {
                        score += 10;
                        System.out.println("Correct!\n");
                    } else {
                        System.out.println("Wrong! The correct answer is 4) all of the above.\n");
                    }

                    // Display Score
                    System.out.println("Your total score: " + score + "\n");
                    break;

                case 2:
                    // View Instructions
                    System.out.println("Instructions:\n1. Choose the correct option for each question.\n2. Each correct answer gives you 10 points.\n3. Have fun!\n");
                    break;

                case 3:
                    // Exit Program
                    keepRunning = false;
                    System.out.println("Thank you for playing the Java Quiz Game. Goodbye!");
                    break;

                default:
                    // Invalid Choice
                    System.out.println("Invalid choice. Please try again.\n");
            }
        }

        // Closing the Scanner
        scanner.close();
    }
}
