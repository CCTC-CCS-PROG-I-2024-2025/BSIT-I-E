mport java.util.Scanner;

public class SimpleBankingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 0.0; 
        

        System.out.println("Welcome to the Simple Banking System!");

        boolean exit = false;
         {
            
            System.out.println("\nChoose an operation:");
            System.out.println("1: Check Balance");
            System.out.println("2: Deposit Money");
            System.out.println("3: Withdraw Money");
            System.out.println("0: Exit");
            
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    
                    System.out.printf("Your current balance is: ", balance);
                    break;

                case 2:
                    
                    System.out.print("Enter amount to deposit: $");
                    double depositAmount = scanner.nextDouble();
                    if (depositAmount > 0) {
                        balance += depositAmount;
                        transactionCount++;
                        System.out.printf("$%.2f deposited. New balance: $%.2f%n", depositAmount, balance);
                    } else {
                        System.out.println("Invalid deposit amount. Please enter a positive amount.");
                    }
                    break;

                case 3:
                   
                    System.out.print("Enter amount to withdraw: $");
                    double withdrawAmount = scanner.nextDouble();
                    if (withdrawAmount > 0 && withdrawAmount <= balance) {
                        balance -= withdrawAmount;
                        transactionCount++;
                        System.out.printf("$%.2f withdrawn. New balance: $%.2f%n", withdrawAmount, balance);
                    } else if (withdrawAmount > balance) {
                        System.out.println("Insufficient funds for this withdrawal.");
                    } else {
                        System.out.println("Invalid withdrawal amount. Please enter a positive amount.");
                    }
                    break;

                case 0:
                    
                    System.out.println("Exiting the program. Thank you for using the Simple Banking System!");
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid option. Please choose a valid operation.");
                    break;
            }

            
            if (transactionCount >= 5) {
                System.out.println("Transaction limit reached. Exiting the system.");
                exit = true;
            }
        }

        scanner.close();
    }
}
```
