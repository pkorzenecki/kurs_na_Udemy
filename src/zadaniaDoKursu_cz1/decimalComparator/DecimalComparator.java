package zadaniaDoKursu_cz1.decimalComparator;

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double firstNum, double secondNum) {

        return (int)(firstNum * 1000) == (int)(secondNum * 1000);

    }
}
