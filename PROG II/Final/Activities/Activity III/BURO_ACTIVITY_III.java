import java.util.Scanner;
class BURO_ACTIVITY_III.java {
    public static double convertToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    public static void main(String[] aargs) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Temperature in celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = convertToFahrenheit(celsius);
        System.out.println("Fahrenheit : " + fahrenheit);

        scanner.close();
    }

}