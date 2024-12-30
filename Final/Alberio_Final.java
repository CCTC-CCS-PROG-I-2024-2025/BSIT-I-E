import java.util.Scanner;

public class ALBERIO_FINAL{
    public static void main(String[] args) {
       
        String studentName;
        int studentAge;
        int quizScore;
        String feedback = "";
        int totalScore = 0;

        Scanner scanner = new Scanner(System.in);

   
        System.out.print("Enter your name: ");
        studentName = scanner.nextLine();
        
        System.out.print("Enter your age: ");
        studentAge = scanner.nextInt();

        System.out.println("\nWelcome, " + studentName + "!");
        System.out.println("Your age: " + studentAge);

        System.out.println("\nAnswer the following questions (score 0-100):");

        System.out.print("Question 1: What is 5 + 3? ");
        quizScore = scanner.nextInt();
        if (quizScore == 😎 {
            totalScore += 50; 
            
            System.out.println("Correct! +50 points.");
        } else {
            System.out.println("Incorrect. The correct answer is 8.");
        }

        System.out.print("Question 2: What is 10 - 4? ");
        quizScore = scanner.nextInt();
        if (quizScore == 6) {
            totalScore += 50; 
            System.out.println("Correct! +50 points.");
        } else {
            System.out.println("Incorrect. The correct answer is 6.");
        }
  
        System.out.println("\nYour Total Score: " + totalScore);
        
        if (totalScore == 100) {
            feedback = "Excellent!";
        } else if (totalScore >= 50) {
            feedback = "Good effort!";
        } else {
            feedback = "Better luck next time!";
        }
        System.out.println("Feedback: " + feedback);

        int gradeLevel = totalScore / 10;
        switch (gradeLevel) {
            case 10:
                System.out.println("Grade Level: A+");
                break;
            case 9:
            case 8:
                System.out.println("Grade Level: A");
                break;
            case 7:
                System.out.println("Grade Level: B");
                break;
            case 6:
                System.out.println("Grade Level: C");
                break;
            case 5:
                System.out.println("Grade Level: D");
                break;
            default:
                System.out.println("Grade Level: F");
                break;
        }

        System.out.println("\nMotivational message:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Keep pushing forward! Attempt " + i);
        }
        scanner.close();
    }
}
