package zadaniaDoKursu_cz4;

public class NumberToWords {

    public static void main(String[] args) {
        numberToWords(1000);
        System.out.println(getDigitCount(1000));
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        int reversed = reverse(number);

        for (int i = 1; i <= getDigitCount(number); i++) {
            switch (reversed % 10) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
            reversed /= 10;
        }
    }

    public static int reverse(int number) {
        int reversed = 0;
        while (number != 0) {
            reversed = (reversed * 10) + number % 10;
            number /= 10;
        }
        return reversed;
    }

    public static int getDigitCount(int number) {
        int digits = 0;
        if (number < 0) {
            return -1;
        }
        do {
            digits++;
            number /= 10;
        } while (number != 0);
        return digits;
    }
}
