import java.util.Scanner;

public class DisplayNameFromArray {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Create an array to store 5 names
        String[] names = new String[5];

        // Prompt the user to enter 5 names
        System.out.println("Enter 5 names:");
        for (int i = 0; i < names.length; i++) {
            System.out.print("Name " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }

        // Ask the user for a number to select a name
        System.out.println("\nChoose a number (1 to 5) to display the corresponding name:");
        int index = scanner.nextInt();

        // Display the selected name
        if (index >= 1 && index <= 5) {
            System.out.println("Selected name: " + names[index - 1]);
        } else {
            System.out.println("Invalid number. Please choose between 1 and 5.");
        }

        // Close the scanner
        scanner.close();
    }
}
