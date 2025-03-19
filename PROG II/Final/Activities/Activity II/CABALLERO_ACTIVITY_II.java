import java.util.Scanner;

public class CABALLERO_ACTIVITY_II {

    public static void main(String[] args) {
        aboutMe();
        double feet = 11;
        double inches = convertFeetToInches(feet);
        displayResult(inches);
    }

    static void aboutMe() {
        String name = "Lawrence Paul E. Caballero";
        int age = 19;
        String address = "Tubod, Toledo City";

        System.out.println("My name is " + name + ", I am " + age + " years old, and I live at " + address + ".");
    }

    public static double convertFeetToInches(double feet) {
        return feet * 12; 
    }

    public static void displayResult(double inches) {
        System.out.println("Inches: " + inches);
    }
}
