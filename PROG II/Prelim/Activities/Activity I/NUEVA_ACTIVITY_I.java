import java.util.Scanner;

public class NUEVA_ACTIVITY_I.java
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
String[] names = new String[5];
System.out.println("Enter 5 names:");
for  (int 1 = 0; 1 <= 4; i++) {
    System.out.print("Enter name " + (i + 1) + ": ");
    names[i] =scanner.nextLine();
}
System.out.print("Enter a number between 1 and 5 to display a name: ");
int index = scanner.nextInt();
if (inddex >= 1 && index <= 5) {
    System.out.print("The name at position " + index + " is: " + names[index - 1]);
} else {
    System.out.println("Please enter a number between 1 and 5.");
     }
   }
}
