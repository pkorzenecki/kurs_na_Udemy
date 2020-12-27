package sekcja1_5.zadaniaDoKursu_cz4;

public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123245));
    }


    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int sum = 0;
        while (number > 0) {
            if (number % 2 == 0) {
                sum += number % 10;
            }
            number /= 10;
        }
        return sum;
    }
}
