package zadaniaDoKursu_cz4;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25, 15));
    }

    public static int getGreatestCommonDivisor(int a, int b) {
        if ((a < 10 || b < 10)) {
            return -1;
        }
        for(int i = b; i > 1; i--) {
            int divisorA = a % i;
            int divisorB = b % i;
            if (divisorA == 0 && divisorB == 0) {
                return i;
            }
        }
        return -1;
    }
}
