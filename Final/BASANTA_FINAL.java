import java.util.Scanner;

public class BASANTA_FINAL {

    public static void main(String[] args) {

        String studentName;
        int studentAge;
        String favoriteSubject;
        int totalMarks = 0;
        String feedback = "";
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        studentName = scanner.nextLine();

        System.out.print("Enter your age: ");
        studentAge = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter your favorite subject: ");
        favoriteSubject = scanner.nextLine();

        System.out.println("\nStudent Name: " + studentName);
        System.out.println("Student Age: " + studentAge);
        System.out.println("Favorite Subject: " + favoriteSubject);

        String[] subjects = {"Mathematics", "English", "Science"};
        for (int i = 0; i < subjects.length; i++) {
            System.out.print("Enter marks for " + subjects[i] + " (0-100): ");
            totalMarks += scanner.nextInt();
        }
        
        double percentage = totalMarks / 3.0;
        System.out.println("\nTotal Marks: " + totalMarks + "/300");
        System.out.println("Percentage: " + percentage + "%");
        if (percentage >= 90) {
            feedback = "Excellent";
        } else if (percentage >= 75) {
            feedback = "Good";
        } else if (percentage >= 50) {
            feedback = "Satisfactory";
        } else {
            feedback = "Needs Improvement";
        }
        
        System.out.println("Feedback: " + feedback);

        if (percentage >= 90) {
            System.out.println("Grade Level: A");
        } else if (percentage >= 75) {
            System.out.println("Grade Level: B");
        } else if (percentage >= 60) {
            System.out.println("Grade Level: C");
        } else {
            System.out.println("Grade Level: D");
        }

        if (studentAge < 18) {
            System.out.println("As a student under 18, you should focus on improving your skills for higher grades!");
        } else {
            System.out.println("As an adult student, your focus should be on mastering your subjects!");
        }

        System.out.println("\nPrinting even numbers from 2 to 20:");
        for (int num = 2; num <= 6; num += 2) {
            System.out.println("Even number: " + num);
        }

        System.out.println("\nMotivational Message (printed 5 times):");
        for (int i = 1; i <= 3; i++) {
            System.out.println("Keep pushing, you're doing great!");
        }

        scanner.close();
    }
}

