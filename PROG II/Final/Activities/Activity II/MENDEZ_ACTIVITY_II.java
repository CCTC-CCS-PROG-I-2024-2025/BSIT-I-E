public class MENDEZ_ACTIVITY_II {
    
    static void aboutMe() {
        
        String name = "Jediah Mendez";
        int age = 21;
        String address = "Buanoy Balamban Cebu";

       
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

