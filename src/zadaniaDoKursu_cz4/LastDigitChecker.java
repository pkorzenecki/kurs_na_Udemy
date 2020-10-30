package zadaniaDoKursu_cz4;

public class LastDigitChecker {
    public static void main(String[] args) {

    }

    public static boolean hasSameLastDigit(int a, int b, int c) {
        if ((a < 10 || a > 1000) || (b < 10 || b > 1000) || (c < 10 || c > 1000)) {

            return false;
        }
        int lastOfA = a % 10;
        int lastOfB = b % 10;
        int lastOfC = c % 10;
        if ((lastOfA == lastOfB) || (lastOfA == lastOfC) || (lastOfB == lastOfC)) {

            return true;
        }
        return false;
    }
    public static boolean isValid(int a) {
        if ((a >= 10) && (a <= 1000)) {
            return true;
        }
        return false;
    }


}
