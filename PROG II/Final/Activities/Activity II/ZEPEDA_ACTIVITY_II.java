import java.util.Scanner;

public class ZEPEDA_ACTIVITY_II {

        static void aboutMe() {
        String name = "Zepeda, Rejean Mary";
        int age = 18;
        String address = "Cantabaco, Toledo City";

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
     public static void main(String[] args) {
        aboutMe();
        double feet = getInput();
        double inches = convertFeetToInches(feet);
        displayResult(inches);
    }

}
