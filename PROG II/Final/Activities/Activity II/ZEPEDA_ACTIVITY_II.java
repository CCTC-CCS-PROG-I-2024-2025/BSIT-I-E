import java.util.Scanner;

public class ZEPEDA_ACTIVITY_II {

    public static void main(String[] args) {
        aboutMe(); 
        displayResult(); 
    }

    static void aboutMe() {
        String name = "Zepeda, Rejean Mary";
        int age = 18;
        String address = "Cantabaco, Toledo City";

        System.out.println("My name is " + name + ", I am " + age + " years old, and I live at " + address + ".");
    }

    public static void displayResult() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of feet: ");
        double feet = scanner.nextDouble();
        double inches = feet * 12; 
        System.out.println("Inches: " + inches);
    }
}
