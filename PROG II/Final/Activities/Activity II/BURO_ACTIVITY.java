import java.util.Scanner;

public class BURO_ACTIVITY {

    public static void main(String[] args) {
        aboutMe();
        double feet = getInput();
        double inches = convertFeetToInches(feet);
        displayResult(inches);
    }

     static void aboutMe() {
        String name = "Sherry Buro";
        int age = 19;
        String address = "Butong Pinamungajan Cebu";

        System.out.println("My name is " + name + ", I am " + age + " years old, and I live at " + address + ".");
    }

    public static double getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of feet: ");
        return scanner.nextDouble();
    }

    public static double convertFeetToInches(double feet) {
        return feet * 12; 
    }

    public static void displayResult(double inches) {
        System.out.println("Inches: " + inches);
    }
}
