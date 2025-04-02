import java.util.Scanner;

public class OCON_ACTIVITY_III {
    
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();

    
        double fahrenheit = celsiusToFahrenheit(celsius);
        System.out.println("Fahrenheit: " + fahrenheit);

        scanner.close();
    }
}
