package sekcja1_5.zadaniaDoKursu_cz4;

public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(9, 99));
    }

    public static boolean hasSharedDigit(int a, int b) {
        if ((a >= 10 && a <= 99) && (b >= 10 && b <= 99)) {
            int firstDigitA = a / 10;
            int secondDigitA = a % 10;
            int firstDigitB = b / 10;
            int secondDigitB = b % 10;
            if ((firstDigitA == firstDigitB) || (firstDigitA == secondDigitB)){
                return true;
            } else return (secondDigitA == firstDigitB) || (secondDigitA == secondDigitB);
        }
        return false;
    }
}
