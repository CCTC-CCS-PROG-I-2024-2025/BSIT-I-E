import java.util.Scanner;

public class PANTONIAL_ACTIVITY_I {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] name = new String[5];

        System.out.println("ENTER THE NAMES YOU WOULD LIKE TO HAVE:");
        for (int x = 0; x < name.length; x++) {
            System.out.print("Enter name " + (x + 1) + ": ");
            name[x] = sc.nextLine();
        }

        System.out.println("\nYou entered the following names:");
        for (int x = 0; x < name.length; x++) {
            System.out.println((x + 1) + ". " + name[x]);
        }

        sc.close();
    }
}
