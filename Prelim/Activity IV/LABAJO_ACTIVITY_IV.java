import java.util.Scanner;

class LABAJO_ACTIVITY_IV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a non-negative integer:");
        int number = sc.nextInt();

        if (number < 0) {
            System.out.println("Please enter a non-negative integer:");
        } else {
            int factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial = factorial * i;
            }
            System.out.println(factorial);
        }
    }
}
