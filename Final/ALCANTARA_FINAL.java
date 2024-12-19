import java.util.Scanner;

public class RestaurantMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("Welcome to the Restaurant Menu");
            System.out.println("1. Pizza");
            System.out.println("2. Burger");
            System.out.println("3. Pasta");
            System.out.println("4. Salad");
            System.out.println("5. Show Selected Items");
            System.out.println("6. Exit");
            System.out.print("Choose an item (1-6): ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                  
                    System.out.println("You selected Pizza.");
                    break;
                case 2:
                    
                    System.out.println("You selected Burger.");
                    break;
                case 3:
                    
                    System.out.println("You selected Pasta.");
                    break;
                case 4:
                    
                    System.out.println("You selected Salad.");
                    break;
                case 5:
                    System.out.println("Your selected items and counts:");
                    
                    }
                    break;
                case 6:
                    System.out.println("Exiting menu. Thank you for visiting!");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
                    break;
            }
            
        } while (choice != 6);

        scanner.close();
    }
              }
