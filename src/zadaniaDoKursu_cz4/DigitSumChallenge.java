package zadaniaDoKursu_cz4;

public class DigitSumChallenge {
    public static void main(String[] args) {
        System.out.println("The sum of the digits in number is " + sumDigits(125));
        System.out.println("The sum of the digits in number is " + sumDigits(999));
        System.out.println("The sum of the digits in number is " + sumDigits(-123));
        System.out.println("The sum of the digits in number is " + sumDigits(4));
        System.out.println("The sum of the digits in number is " + sumDigits(32123));
    }

    private static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }

        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;

            number /= 10;
        }
        return sum;


//        int units = (number % 100) % 10;
//        int dozens = (number / 10) % 10;
//        int tons = number / 100;
//        int sum = number;
//        sum += sum;
//
//        System.out.println(units + dozens + tons);
//        System.out.println(units + dozens);
//        System.out.println(units);
//
//        return -1;
    }
}
