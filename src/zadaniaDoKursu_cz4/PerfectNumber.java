package zadaniaDoKursu_cz4;

public class PerfectNumber {
    public static void main(String[] args) {
        isPerfectNumber(5);
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }
        int divisor = 1;
        int sum = 0;

        while (divisor < number) {
            if (number % divisor == 0) {
                sum += divisor;
                System.out.println(sum);
            }
            divisor++;
        }
        return sum == number;
    }
}
