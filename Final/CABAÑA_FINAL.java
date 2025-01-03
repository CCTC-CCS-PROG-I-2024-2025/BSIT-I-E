import java.util.Scanner;

public class CABAÑA_FINAL{
    public static void main(String[] args) {

        String name;
        int age;
        int score = 0;
        int doubledScore = 0;
        String studentGrade = "";

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        name = input.nextLine();

        System.out.print("Enter your age: ");
        age = input.nextInt();

        System.out.println("\nStudent Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        System.out.print("Enter your score (1-100): ");
        score = input.nextInt();

        if (score >= 1 && score <= 100) {
            doubledScore = score * 2;
            System.out.println("Doubled Score: " + doubledScore);

            if (score >= 90) {
                studentGrade = "A";
            } else if (score >= 89) {
                studentGrade = "B";
            } else if (score >= 75) {
                studentGrade = "C";
            } else if (score >= 64) {
                studentGrade = "D";
            } else {
                studentGrade = "F";
            }

            System.out.println("Your Grade: " + studentGrade);
        } else {
            System.out.println("Invalid score. Please enter a valid score between 1 and 100.");
        }

        int scoreRange = score / 10;
        switch (scoreRange) {
            case 10:
            case 9:
                System.out.println("Performance Level: Outstanding");
                break;
            case 8:
                System.out.println("Performance Level: Very Good");
                break;
            case 7:
                System.out.println("Performance Level: Good");
                break;
            case 6:
                System.out.println("Performance Level: Satisfactory");
                break;
            default:
                System.out.println("Performance Level: Needs Improvement");
                break;
        }

        System.out.println("\nDisplaying numbers from 1 to 10:");
        for (int number = 1; number <= 10; number++) {
            System.out.println("Number: " + number);
        }
        input.close();
    }
}
    