import java.util.Scanner;
class OCON_ACTIVITY_IV{
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a non-negative integer:");
int number = scanner.nextInt();
        if(number<0){
            System.out.println("Error");
                    }   else {
                        int factorial = 1;
                        for(int i=1; i<=number; i++){
                            factorial *=i;
                        }
                        System.out.println(factorial);
                    }   
                    scanner.close();
    }    
}
