import java.util.Scanner;

public class RestaurantOrderSystem {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize variables
        String name = "";
        int foodChoice = 0;
        int quantity = 0;
        double totalCost = 0;

        // Ask for user's name
        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        // Display the restaurant menu
        displayMenu();

        // Ask for food choice and quantity
        boolean validChoice = false;
        while (!validChoice) {
            System.out.print("Enter the food item number you want to order (1-5): ");
            foodChoice = scanner.nextInt();

            if (foodChoice >= 1 && foodChoice <= 5) {
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
        totalCost = calculateTotalCost(foodChoice, quantity);

        // Print the order summary
        System.out.println("\nOrder Summary:");
        System.out.println("Name: " + name);
        System.out.println("Food Item: " + getFoodName(foodChoice));
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: Php " + totalCost);

        // Close the Scanner object
        scanner.close();
    }

    // Method to display the restaurant menu
    public static void displayMenu() {
        System.out.println("\nRestaurant Menu:");
        System.out.println("1. Burger - Php 150.00");
        System.out.println("2. Pizza - Php 300.00");
        System.out.println("3. Pasta - Php 180.00");
        System.out.println("4. Salad - Php 120.00");
        System.out.println("5. Ice Cream - Php 80.00");
    }

    // Method to get the food name based on the food choice
    public static String getFoodName(int foodChoice) {
        switch (foodChoice) {
            case 1: return "Burger";
            case 2: return "Pizza";
            case 3: return "Pasta";
            case 4: return "Salad";
            case 5: return "Ice Cream";
            default: return "Unknown Item";
        }
    }

    // Method to calculate total cost
    public static double calculateTotalCost(int foodChoice, int quantity) {
        double price = 0;
        switch (foodChoice) {
            case 1: price = 150.00; break;
            case 2: price = 300.00; break;
            case 3: price = 180.00; break;
            case 4: price = 120.00; break;
            case 5: price = 80.00; break;
        }
        return price * quantity;
    }
}