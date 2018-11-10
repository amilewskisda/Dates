import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterTester {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("Default format of LocalDate: " + date);
        System.out.println(date.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")));

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Default format of LocalDateTime: " + dateTime);
        System.out.println(dateTime.format(DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm::ss")));
    }
}
