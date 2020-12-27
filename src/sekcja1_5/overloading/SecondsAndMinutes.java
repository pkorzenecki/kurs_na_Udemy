package sekcja1_5.overloading;

public class SecondsAndMinutes {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {
        System.out.println(getDurationString(300, 34));
        System.out.println(getDurationString(5690L));
        System.out.println(getDurationString(-45));
        System.out.println(getDurationString(69,9));
    }

    private static String getDurationString(long minutes, long seconds) {
        if ((minutes < 0) || ((seconds < 0) || (seconds > 59))) {
            return INVALID_VALUE_MESSAGE;
        }
        long hours = minutes / 60;
        long remaingMinutes = minutes % 60;
        
        String hoursString = hours + "h";
        if(hours < 10) {
            hoursString = "0" + hoursString;
        }
        String minutesString = remaingMinutes + "m";
        if(remaingMinutes < 10) {
            minutesString = "0" + minutesString;
        }
        String secondsString = seconds + "s";
        if (seconds < 10) {
            secondsString = "0" + secondsString;
        }

        return "There pass " + hoursString + " " + minutesString + " " + secondsString;
    }

    private static String getDurationString(long seconds) {
        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }
        long minutes = seconds / 60;
        long remaingSeconds = seconds % 60;

        return getDurationString(minutes, remaingSeconds);

    }

}
