import java.util.Scanner;

public class BAUTISTA_FINAL {
    public static void main(String[] args) {
     
        String studentName; 
        String studentBirthdate; 
        int studentID; 
        int userPoints = 0;
        int mathResult = 0;
        String grade = "";

        Scanner scanner = new Scanner(System.in);

   
        System.out.print("Enter your name: ");
        studentName = scanner.nextLine(); 

        System.out.print("Enter your birthdate: ");
        studentBirthdate = scanner.nextLine(); 

        System.out.print("Enter your student ID: ");
        studentID = scanner.nextInt(); 

        System.out.println("\nStudent Name: " + studentName);
        System.out.println("Student Birthdate: " + studentBirthdate);
        System.out.println("Student ID: " + studentID);


        System.out.print("Enter your points (1-100): ");
        userPoints = scanner.nextInt();


        if (userPoints >= 1 && userPoints <= 100) {
 
            mathResult = userPoints * 2;
            System.out.println("Math Result: " + mathResult);

            if (userPoints >= 90) {
                grade = "A";
            } else if (userPoints >= 80) {
                grade = "B";
            } else if (userPoints >= 70) {
                grade = "C";
            } else if (userPoints >= 60) {
                grade = "D";
            } else {
                grade = "F";
            }

            System.out.println("Grade: " + grade);
        } else {
            System.out.println("Invalid points. Please enter a value between 1 and 100.");
        }

        int gradeLevel = userPoints / 10;
        switch (gradeLevel) {
            case 10:
            case 9:
                System.out.println("Grade Level: Excellent");
                break;
            case 8:
                System.out.println("Grade Level: Good");
                break;
            case 7:
                System.out.println("Grade Level: Fair");
                break;
            case 6:
                System.out.println("Grade Level: Poor");
                break;
            default:
                System.out.println("Grade Level: Failing");
                break;
        }

        System.out.println("\nPrinting numbers from 1 to 10 (for loop):");
        for (int j = 1; j <= 10; j++) {
            System.out.println("Number: " + j);
        }

        scanner.close();
    }
}
