import java.util.Scanner;

public class BAUTISTA_ACTIVITY {

    public static void main(String[] args) {
        aboutMe();
        double feet = getInput();
        double inches = convertFeetToInches(feet);
        displayResult(inches);
    }

     static void aboutMe() {
        String name = "MARK ALFIE BAUTISTA";
        int age = 21;
        String address = "Buanoy, Balamban";

        System.out.println("My name is " + name + ", I am " + age + " years old, and I live at " + address + ".");
    }

    public static double getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of feet: ");
        return scanner.nextDouble();
    }

    public static double convertFeetToInches(double feet) {
        return feet * 12; // 1 foot = 12 inches
    }

    public static void displayResult(double inches) {
        System.out.println("Inches: " + inches);
    }
}
