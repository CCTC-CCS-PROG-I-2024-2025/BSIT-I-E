import java.util.Scanner;

class BURO_FINALS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Number of subjects
        System.out.print("Enter the number of subjects: ");
        int numSubjects = sc.nextInt();
        
        // Array to store grades for each subject
        double[] grades = new double[numSubjects];
        
        // Loop to input grades for each subject
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter the grade for subject " + (i + 1) + ": ");
            grades[i] = sc.nextDouble();
        }
        
        // Compute average
        double total = 0;
        for (int i = 0; i < numSubjects; i++) {
            total += grades[i];
        }
        double average = total / numSubjects;
        
        // Output average grade
        System.out.println("The average grade is: " + average);
        
        // Grade evaluation using if-else
        if (average >= 90) {
            System.out.println("Your grade is A.");
        } else if (average >= 80) {
            System.out.println("Your grade is B.");
        } else if (average >= 75) {
            System.out.println("Your grade is C.");
        }  else {
            System.out.println("Your grade is D.");
        }
        
        // Using switch to evaluate grade based on average
        int gradeCategory = (int) average / 10;  // Divide by 10 to get the tens place
        switch (gradeCategory) {
            case 9:  // Grade A (90 and above)
                System.out.println("Excellent! You got an A.");
                break;
            case 8:  // Grade B (80-89)
                System.out.println("Good job! You got a B.");
                break;
            case 7:  // Grade C (75-79)
                System.out.println("You passed with a C.");
                break;
            default:  // Grade D (below 60)
                System.out.println("Unfortunately, you failed.");
        }
        
        sc.close();
    }
}
