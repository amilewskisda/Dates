import java.time.LocalDate;
import java.time.Period;

public class AgeCalculator {
    public static void main(String[] args)
    {
        LocalDate birthDate = LocalDate.of(1989, 2, 18);
        LocalDate now = LocalDate.now();
        Period diff = Period.between(birthDate, now);

        System.out.printf("I am  %d years, %d months and %d days old.",
                diff.getYears(), diff.getMonths(), diff.getDays());
    }
}

