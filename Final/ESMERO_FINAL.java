import java.util.Scanner;

public class OnlineGroceryStore {
    
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

        // Display the online grocery store catalog
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

    // Method to display the online grocery store catalog
    public static void displayCatalog() {
        System.out.println("\nOnline Grocery Store Catalog:");
        System.out.println("1. Rice - Php 45.00 per kg");
        System.out.println("2. Sugar - Php 55.00 per kg");
        System.out.println("3. Cooking Oil - Php 120.00 per liter");
        System.out.println("4. Salt - Php 20.00 per kg");
        System.out.println("5. Milk - Php 85.00 per liter");
    }

    // Method to get the product name based on the product choice
    public static String getProductName(int productChoice) {
        switch (productChoice) {
            case 1: return "Rice";
            case 2: return "Sugar";
            case 3: return "Cooking Oil";
            case 4: return "Salt";
            case 5: return "Milk";
            default: return "Unknown Product";
        }
    }

    // Method to calculate total cost
    public static double calculateTotalCost(int productChoice, int quantity) {
        double price = 0;
        switch (productChoice) {
            case 1: price = 45.00; break;
            case 2: price = 55.00; break;
            case 3: price = 120.00; break;
            case 4: price = 20.00; break;
            case 5: price = 85.00; break;
        }
        return price * quantity;
    }
}