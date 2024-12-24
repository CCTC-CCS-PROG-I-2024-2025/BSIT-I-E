import java.util.Scanner;

public class PANTONIAL_FINAL {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numScores;

        System.out.println("Simple Grade Calculator");
        System.out.print("Enter the number of scores: ");
        numScores = scanner.nextInt();

        if (numScores <= 0) {
            System.out.println("Error: Number of scores must be positive.");
            return;
        }

        double[] scores = new double[numScores];
        double sum = 0;

        for (int i = 0; i < numScores; i++) {
            System.out.print("Enter score " + (i + 1) + ": ");
            scores[i] = scanner.nextDouble();
            sum += scores[i];

            //Input validation: Check for scores outside the 0-100 range.
            if(scores[i] < 0 || scores[i] > 100){
                System.out.println("Error: Score must be between 0 and 100. Please re-enter scores.");
                return;
            }
        }

        double average = sum / numScores;
        char grade;

        if (average >= 90) {
            grade = 'A';
        } else if (average >= 80) {
            grade = 'B';
        } else if (average >= 70) {
            grade = 'C';
        } else if (average >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Average score: " + average);
        System.out.println("Letter grade: " + grade);
        scanner.close();
    }
}
