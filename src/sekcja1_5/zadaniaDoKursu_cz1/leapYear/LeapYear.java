package sekcja1_5.zadaniaDoKursu_cz1.leapYear;

public class LeapYear {
    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        } else if (year % 4 == 0) {
            if ((year % 100 != 0) || (year % 400 == 0)) {
                return true;
            }
        }
        return false;
    }

}
