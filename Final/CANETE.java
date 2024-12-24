import java.util.Scanner;

class CANETE_SIMPLEBANKINGSYSTEM{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    double balance = 0.0;

  System.out.println("Welcome to the Simple Banking System!");
    
    boolean ext = false;{
      System.out.println("1:Check Balance");
      System.out.println("2:Deposit Money");
      System.out.println("3:Withdraw Money");
      System.out.println("0:Exit");

    int option = scanner.nextln();
      switch (option){
        case 1:
          //Check balance
      System.out.println("Your current balance is:",balance);
          break;
        case 2:
          //Deposit money
      System.out.printf($%.2fdeposited. New balance: $%.2f%n", depositAmount,balance);
      } else {
        System.out.println("Enter amount to withdraw:$");
        double withdrawAmount = scanner nextDouble();
        if(withdrawAmount > 0 && withdrawAmount <= balance){
          balance -= withdrawAmount;
          transactionCount++;

        System.out.printf("$%.2fwithdraw. New balance: $%.2f%n", withdrawAmount, balance);

        } else if(withdrawAmount > balance){
          System.out.println("Insufficient funds for this withdrawal.");
        } else {
          System.out.println("Invalid wihtdrawal amount. Please enter a positive amount.");
        }
        break;

        case 0;
        //Exit the program
      System.out.println("Exiting the program. Thank you for using the Simple Banking System!");

      exit = true;
        break;

        default:
          System.out.println("Invalid option. Please choose a valid operation.");
        break;
      }
      //Check transaction count
    if (transactionCount >=5){
      System.out.println("Transaction limit reached. Exiting the system.");

      exit = true;
    }
    }
    scanner.close();
  }
}
