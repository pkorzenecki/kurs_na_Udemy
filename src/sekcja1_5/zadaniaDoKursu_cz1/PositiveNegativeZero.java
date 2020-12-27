package sekcja1_5.zadaniaDoKursu_cz1;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        checkNumber(5);
        checkNumber(0);

    }

    public static void checkNumber(int number) {
        if (number > 0) {
            System.out.println("Number is positive");
        } else if (number < 0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is Zero");
        }
    }
}
