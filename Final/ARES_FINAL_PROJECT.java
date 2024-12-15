import  java.util.Scanner;
 class ARES_FOODMINISTORE {
    public static void main (String[] args) {
        
        
       
        System.out.println("Welcome to ARES FOOD MENU");
        System.out.println("----------------------------");
        System.out.println("1. Chicken Burger - $2.50");
        System.out.println("2. Cheese Burger - $2.45");
        System.out.println("3. Fries - $2.00");
        System.out.println("4. Blue Lemonade - $1.50");
        System.out.println("5. Ice Tea - $1.50");
        System.out.println("6. Fried Chicken - $3.50");
        System.out.println("7. Cookies and Cream Sundae - $2.80");
        System.out.println("8. Spaghetti - $3.00");
        System.out.println("9. Done Ordering");
        System.out.println("----------------------------");
        
        Scanner scanner = new Scanner(System.in);
        int choice;
        double total = 0.0;
        do{
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();

            switch(choice){
                case 1: total+=2.50;
                break;
                case 2: total+=2.45;
                break;
                case 3: total+=2.00;
                break;
                case 4: total+=1.50;
                break;
                case 5: total+=1.50;
                break;
                case 6: total+=3.50;
                break;
                case 7: total+=2.80;
                break;
                case 8: total+=3.00;
                break;
                case 9:
                break;
                default:
                    System.out.println("Invalid Option!");
            }
        }while(choice!=5);
        
        System.out.println("Your total is $" + total);
        System.out.println("Enter your payment amount: ");
        double payment = scanner.nextDouble();
        if(payment>total){
            double change = payment - total;
            System.out.println("Thank you for ordering!");
            System.out.println("Your change is $" + change);
        } else {
            System.out.println("You don't have enough balance");
        }
            scanner.close();
    }
 }