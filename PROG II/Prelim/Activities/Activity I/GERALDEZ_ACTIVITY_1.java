import java.util.Scanner;

public class GERALDEZ_ACTIVITY_V {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = {"Mark Zuckerberg", "Elon Musk", "Bill Gates", "Jeff Bezos", "Sundar Pichai"};

        System.out.print("Enter a number (1-5) to select a name: ");
        int index = scanner.nextInt();

        if (index >= 1 && index <= 5) {
            System.out.println("Selected name: " + names[index - 1]);
        } else {
            System.out.println("Invalid number. Please enter a number between 1 and 5.");
        }

        scanner.close();
    }
}
