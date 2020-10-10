package zadaniaDoKursu_cz3;

public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600));
        System.out.println(getDaysInMonth(2, -1600));
        System.out.println(isLeapYear(1600));
        System.out.println(getDaysInMonth(2, 1600));
        System.out.println(isLeapYear(2017));
        System.out.println(getDaysInMonth(2, 2017));
        System.out.println(isLeapYear(2000));
        System.out.println(getDaysInMonth(2, 2000));
    }

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

    public static int getDaysInMonth(int month, int year) {
        if (((month < 1) || (month > 12)) || ((year < 1) || (year > 9999))) {
            return -1;
        }
        if (isLeapYear(year)) {
            if (month == 2) {
                return 29;
            }
        }
        switch (month) {
            case 2:
                return 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 31;
        }

    }

}
