import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeZonesExample {
    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);

        // wejdz do klasy ZoneId zeby zobaczyc jakie sa dostepne id
        ZonedDateTime nowInNewYork = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println(nowInNewYork);

        LocalDateTime localDateTime = LocalDateTime.parse("2013-04-01T09:00");
        ZoneId zoneId = ZoneId.of("Europe/Paris");
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, zoneId);
        System.out.println(zonedDateTime);

        // przydatne przy zapisie do pliku, odebrania daty z api
        ZonedDateTime asiaZDT = ZonedDateTime.parse("2018-07-01T10:00:00Z[Asia/Shanghai]");
    }
}
