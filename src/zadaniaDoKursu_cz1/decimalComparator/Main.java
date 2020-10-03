package zadaniaDoKursu_cz1.decimalComparator;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        boolean b = DecimalComparator.areEqualByThreeDecimalPlaces(3.123, 3.123);
        System.out.println(b);
    }
}
