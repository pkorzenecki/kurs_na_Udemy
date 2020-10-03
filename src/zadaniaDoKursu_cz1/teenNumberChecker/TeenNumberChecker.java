package zadaniaDoKursu_cz1.teenNumberChecker;

public class TeenNumberChecker {
    public static void main(String[] args) {
        System.out.println(hasTeen(34, 15, 99));
        System.out.println(isTeen(13));

    }

    public static boolean hasTeen(int a, int b, int c) {
        return ((a >= 13 && a <= 19)) || ((b >= 13 && b <= 19)) || ((c >= 13 && c <= 19));
    }

    public static boolean isTeen(int age) {
        return (age >= 13 && age <= 19);
    }
}
