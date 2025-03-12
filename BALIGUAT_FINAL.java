public class StudentManagementSystem {

   
    public static double calculateAverage(int[] grades) {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }

  
    public static String evaluatePerformance(double average) {
        if (average >= 90) {
            return "Excellent";
        } else if (average >= 75) {
            return "Good";
        } else if (average >= 50) {
            return "Needs Improvement";
        } else {
            return "Poor";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Welcome to the Student Management System!");
        System.out.println("1. Add Student");
        System.out.println("2. View All Students");
        System.out.println("3. Exit");

        
        String[] studentNames = new String[10];
        int[][] studentGrades = new int[10][];
        int studentCount = 0;

        while (true) {
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1: 
                    if (studentCount < studentNames.length) {
                        System.out.print("Enter student name: ");
                        scanner.nextLine();
                        String name = scanner.nextLine();
                        studentNames[studentCount] = name;

                        System.out.print("Enter the number of subjects: ");
                        int numSubjects = scanner.nextInt();
                        studentGrades[studentCount] = new int[numSubjects];

                        System.out.println("Enter grades for " + numSubjects + " subjects:");
                        for (int i = 0; i < numSubjects; i++) {
                            studentGrades[studentCount][i] = scanner.nextInt();
                        }

                        studentCount++;
                        System.out.println("Student added successfully!");
                    } else {
                        System.out.println("Error: Maximum student limit reached.");
                    }
                    break;

                case 2: 
                    if (studentCount == 0) {
                        System.out.println("No students to display.");
                    } else {
                        for (int i = 0; i < studentCount; i++) {
                            System.out.println("Student Name: " + studentNames[i]);
                            System.out.print("Grades: ");
                            for (int grade : studentGrades[i]) {
                                System.out.print(grade + " ");
                            }
                            double average = calculateAverage(studentGrades[i]);
                            System.out.println("\nAverage: " + average);
                            System.out.println("Performance: " + evaluatePerformance(average));
                        }
                    }
                    break;

                case 3: 
                    System.out.println("Exiting the program. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
