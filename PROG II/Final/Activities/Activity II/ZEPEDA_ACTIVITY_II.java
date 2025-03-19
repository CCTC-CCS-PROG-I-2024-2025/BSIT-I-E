import java.util.Scanner;

public class ZEPEDA_ACTIVITY_II {

    static void aboutMe() {
        String name = "Zepeda, Rejean Mary";
        int age = 18;
        String address = "Cantabaco, Toledo City";

        System.out.println("My name is " + name + ", I am " + age + " years old, and I live at " + address + ".");
    }

    static void convertFeetToInches(double feet) {
        double inches = feet * 12;
        System.out.println("Inches: " + inches);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        aboutMe();
        System.out.print("Enter the number of feet: ");
        double feet = scanner.nextDouble();
        convertFeetToInches(feet);
    }
}
