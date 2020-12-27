package sekcja1_5.zadaniaDoKursu_cz4;

public class SumOddRange {
    public static void main(String[] args) {
        System.out.println(sumOdd(13, 13 ));
    }
    public static boolean isOdd(int number) {
        if((number > 0) && (number % 2 != 0)) {
            return true;
        }
        return false;
    }
    public static int sumOdd(int start, int end) {
        int sum = 0;
        if(end >= start && start > 0) {
            for (int i = start; i <= end; i++) {
                if(isOdd(i)) {
                    sum += i;
                }
            }
            System.out.print("The sum is ");
            return sum;
        }
        return -1;
    }
}
