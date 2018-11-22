import java.time.LocalDateTime;

public class TimeToMidnight {

    private static final int HOURS_IN_DAY = 24;
    private static final int MINUTES_IN_HOUR = 60;
    private static final int SECONDS_IN_HOUR = 60;

    public static void main(String[] args) {
        int secondsToMidnight = calculateSecondsToMidnight();
        System.out.println("Do końca doby pozostało " + secondsToMidnight + " sekund");
    }

    private static int calculateSecondsToMidnight() {
        LocalDateTime now = LocalDateTime.now();
        int hour = now.getHour();
        int minute = now.getMinute();
        int secondsInDay = HOURS_IN_DAY * MINUTES_IN_HOUR * SECONDS_IN_HOUR;
        int hoursToSubtract = hour * MINUTES_IN_HOUR * SECONDS_IN_HOUR;
        int minutesToSubtract = minute * SECONDS_IN_HOUR;
        int secondsToMidnight = secondsInDay - hoursToSubtract - minutesToSubtract;
        return secondsToMidnight;
    }
}
