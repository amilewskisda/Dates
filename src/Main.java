import java.time.*;

// Punktem odniesienia w programowaniu jeżeli chodzi o daty jest tzw. czas uniksowy czyli czas jaki minął od roku 1970.
// wszystkie klasy w nowym DateTimeApi są niemodyfikowalne jak w klasa String

public class Main {
    public static void main(String[] args) {
        // testInstant();
        // testLocalTime();
        // testLocalDate();
         testLocalDateTime();
    }

    private static void testInstant() {
        Instant actualTime = Instant.now();
        System.out.println(actualTime);
        Instant actualTime2 = Instant.now();
        System.out.println(actualTime2);
        Duration duration = Duration.between(actualTime, actualTime2);
        System.out.println(duration.getNano()); //getSeconds()
    }

    private static void testLocalTime() {
        LocalTime now = LocalTime.now();
        System.out.println(now);
        System.out.println(now.getHour());

        LocalTime fiveOClock = LocalTime.of(5,0, 0,0);
        System.out.println(fiveOClock);
        LocalTime sixOClock = LocalTime.of(6,0, 0,0);
        System.out.println(sixOClock);

        System.out.println(fiveOClock.isBefore(sixOClock));
    }

    private static void testLocalDate() {
        LocalDate today = LocalDate.now();
        System.out.println(today);
        LocalDate nearestChristmas = LocalDate.of(2019, 12, 24);
        System.out.println(nearestChristmas);

        System.out.println(nearestChristmas.isAfter(today));

        System.out.println(nearestChristmas.getMonth());
        System.out.println(nearestChristmas.getDayOfYear());
    }

    private static void testLocalDateTime() {
        LocalDateTime localDateTime = LocalDateTime.parse("2018-07-01T08:00");

        // ZADANIA -
        // 1) utwórz drugi obiekt LocalDateTime z datą 2017-06-01 godz. 9:51 sprawdź czy jest datą wcześniejszą od tej poprzedniej
        // 2) utwórz LocalDateTime korzystając z LocalDate i LocalTime
        // 3) Stwórz klasę Samochód z polami marka, cena, dataUtworzenia. Przypisuj odpowiednią datę do pola dataUtworzenia
        // w momencie tworzenia obiektu, Stwórz tak z 3 obiekty zapisz je w liście i wyświetl
    }
}
