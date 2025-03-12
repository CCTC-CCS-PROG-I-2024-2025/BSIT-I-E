import java.util.Scanner;

public class BULARIN_FINALS {
    public static void main(String[] args) {
        String userName;
        int age;
        double userScore = 0.0;
        boolean retry;

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        userName = scanner.nextLine();

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        
        System.out.println("\nWelcome to the Quiz, " + userName + "!");
        System.out.println("Age: " + age);
        System.out.println("Let's test your math skills!");

        
        do {
            retry = false;
            userScore = 0.0;
            
            System.out.print("\nQuestion 1: What is 7 + 5? ");
            int answer1 = scanner.nextInt();
            if (answer1 == 12) {
                userScore += 10; 
                System.out.println("Correct! +10 points.");
            } else {
                System.out.println("Incorrect. The correct answer is 12.");
            }

            System.out.print("Question 2: What is 6 x 3? ");
            int answer2 = scanner.nextInt();
            if (answer2 == 18) {
                userScore += 10;
                System.out.println("Correct! +10 points.");
            } else {
                System.out.println("Incorrect. The correct answer is 18.");
            }

         
            System.out.print("Question 3: What is 20 ÷ 4? ");
            int answer3 = scanner.nextInt();
            if (answer3 == 5) {
                userScore += 10;
                System.out.println("Correct! +10 points.");
            } else {
                System.out.println("Incorrect. The correct answer is 5.");
            }

            System.out.print("\nBonus Question: Enter a number, and I'll show you its multiplication table: ");
            int tableNumber = scanner.nextInt();
            System.out.println("\nMultiplication Table for " + tableNumber + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(tableNumber + " x " + i + " = " + (tableNumber * i));
            }

           
            System.out.println("\nYour Total Score: " + userScore + "/30");
            if (userScore == 30) {
                System.out.println("Feedback: Excellent work, " + userName + "! You aced the quiz!");
            } else if (userScore >= 20) {
                System.out.println("Feedback: Good job, " + userName + "! Keep practicing to score even higher.");
            } else {
                System.out.println("Feedback: Better luck next time, " + userName + ". Keep learning!");
            }

           
            System.out.print("\nWould you like to try again? (true/false): ");
            retry = scanner.nextBoolean();

        } while (retry);

      
        System.out.println("\nThank you for playing the Interactive Quiz, " + userName + "! Goodbye!");
        scanner.close();
    }
}
