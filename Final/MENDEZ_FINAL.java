import java.util.Scanner;

public class OnlineSellerSystem {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize variables
        String customerName = "";
        int productChoice = 0;
        int quantity = 0;
        double totalCost = 0;

        // Ask for customer's name
        System.out.print("Enter your name: ");
        customerName = scanner.nextLine();

        // Display the online store catalog
        displayCatalog();

        // Ask for product choice and quantity
        boolean validChoice = false;
        while (!validChoice) {
            System.out.print("Enter the product number you want to purchase (1-5): ");
            productChoice = scanner.nextInt();

            if (productChoice >= 1 && productChoice <= 5) {
                validChoice = true;
            } else {
                System.out.println("Invalid choice. Please select a number between 1 and 5.");
            }
        }

        // Ask for quantity
        boolean validQuantity = false;
        while (!validQuantity) {
            System.out.print("Enter the quantity: ");
            quantity = scanner.nextInt();

            if (quantity > 0) {
                validQuantity = true;
            } else {
                System.out.println("Invalid input. Please enter a positive number.");
            }
        }

        // Calculate the total cost
        totalCost = calculateTotalCost(productChoice, quantity);

        // Print the order summary
        System.out.println("\nOrder Summary:");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Product: " + getProductName(productChoice));
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: Php " + totalCost);

        // Close the Scanner object
        scanner.close();
    }

    // Method to display the online store catalog
    public static void displayCatalog() {
        System.out.println("\nOnline Store Catalog:");
        System.out.println("1. T-Shirt - Php 250.00");
        System.out.println("2. Wireless Earphones - Php 1,200.00");
        System.out.println("3. Laptop - Php 35,000.00");
        System.out.println("4. Watch - Php 3,000.00");
        System.out.println("5. Phone Case - Php 150.00");
    }

    // Method to get the product name based on the product choice
    public static String getProductName(int productChoice) {
        switch (productChoice) {
            case 1: return "T-Shirt";
            case 2: return "Wireless Earphones";
            case 3: return "Laptop";
            case 4: return "Watch";
            case 5: return "Phone Case";
            default: return "Unknown Product";
        }
    }

    // Method to calculate total cost
    public static double calculateTotalCost(int productChoice, int quantity) {
        double price = 0;
        switch (productChoice) {
            case 1: price = 250.00; break;
            case 2: price = 1200.00; break;
            case 3: price = 35000.00; break;
            case 4: price = 3000.00; break;
            case 5: price = 150.00; break;
        }
        return price * quantity;
    }
}