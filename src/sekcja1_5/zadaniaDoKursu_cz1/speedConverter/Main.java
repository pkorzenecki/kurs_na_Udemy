package sekcja1_5.zadaniaDoKursu_cz1.speedConverter;

public class Main {
    public static void main(String[] args) {
        double miles = SpeedConverter.toMilesPerHour(10.5);
        System.out.println("Miles = " + miles);

        SpeedConverter.printConversion(10.5);
    }
}
