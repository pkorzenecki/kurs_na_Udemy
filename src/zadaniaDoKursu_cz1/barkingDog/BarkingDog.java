package zadaniaDoKursu_cz1.barkingDog;

public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (barking) {
            if (hourOfDay >= 0 && hourOfDay <= 23) {
                if (hourOfDay < 8 || hourOfDay > 22) {
                    barking = true;
                } else if (hourOfDay < 0 || hourOfDay > 23) {
                    barking = false;
                } else {
                    barking = false;
                }
            } else {
                barking = false;
            }
        }
        return barking;
    }
}

