package zadaniaDoKursu_cz2;

public class MinutesToYearsDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
        printYearsAndDays(-1);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long hours = minutes / 60;
            int days = (int) hours / 24;
            int years = days / 365;
            days %= 365;

            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }
}
