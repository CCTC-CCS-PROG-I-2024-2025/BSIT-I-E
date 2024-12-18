import java.util.Scanner;

public class LAROBIS_FINAL {
    public static void main(String[] args) {

        String name;
        int age;
        int score = 0;
        float gpa;
        int doubledScore = 0;
        String studentGrade = "";

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        name = input.nextLine();

        System.out.print("Enter your age: ");
        age = input.nextInt();

        System.out.print("Enter your GPA (e.g., 3.75): ");
        gpa = input.nextFloat();

        System.out.println("\nStudent Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);

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

        if (age % 2 == 0) {
            System.out.println("Too young.");
        } else {
            System.out.println("OLDIE");
        }

       
        System.out.println("\nDisplaying numbers from 1 to 10:");
        for (int number = 1; number <= 10; number++) {
            System.out.println("Number: " + number);
        }

        input.close();
    }
}
