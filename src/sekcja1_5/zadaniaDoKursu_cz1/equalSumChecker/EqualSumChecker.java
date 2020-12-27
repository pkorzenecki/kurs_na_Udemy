package sekcja1_5.zadaniaDoKursu_cz1.equalSumChecker;

public class EqualSumChecker {
    public static void main(String[] args) {
        System.out.println(hasEqualSum(2,4,6));

    }

    public static boolean hasEqualSum(int a, int b, int c) {

        return (a + b) == c;
    }
}
