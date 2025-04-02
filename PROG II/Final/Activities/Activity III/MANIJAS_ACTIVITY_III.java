import java.util.Scanner;

class MANIJAS_ACTIVITY_III {
    
    static double convertToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = convertToFahrenheit(celsius);
        System.out.println("Fahrenheit: " + fahrenheit);

    }
}

