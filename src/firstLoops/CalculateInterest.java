package firstLoops;

public class CalculateInterest {
    public static void main(String[] args) {
        /*System.out.println("10,000 at 2% interest = " + calculateInterest(10_000.0, 2.0));
        System.out.println("10,000 at 2% interest = " + calculateInterest(10_000.0, 3.0));
        System.out.println("10,000 at 2% interest = " + calculateInterest(10_000.0, 4.0));
        System.out.println("10,000 at 2% interest = " + calculateInterest(10_000.0, 5.0));
        System.out.println("10,000 at 2% interest = " + calculateInterest(10_000.0, 6.0));*/

        for (int i = 1; i <= 9; i++) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10_000.0, i)));
            //%.2f - ogranicza wyświetlanie wyniku do dwóch miejsc po przecinku
        }

        System.out.println("**************************");

        for (int i = 9; i >= 2; i--) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10_000.0, i)));
            //%.2f - ogranicza wyświetlanie wyniku do dwóch miejsc po przecinku
        }
        int count = 0;
        for(int i = 10; i < 50; i++) {
            if(isPrime(i)) {
                count++;
                System.out.println("Number " + i + " is a prime number");
                if(count == 3) {
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }
    }

    public static boolean isPrime(int n) {


        if(n == 1) {
            return false;
        }
        //int count = 0;
        for (int i = 2; i <= n / 2; i++) {
            if(n % i == 0) {
                return false;
            }
         //   count++;
         //   System.out.println(count);
        }
        return true;
    }

    public static void howManyPrimes() {

    }
    public static double calculateInterest(double amount, double interestRate){
        return(amount *(interestRate/100));
    }
}
