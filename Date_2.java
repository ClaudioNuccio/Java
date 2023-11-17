package Java;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Date_2 {
    public static void main(String[] args) {
        OffsetDateTime exercise = OffsetDateTime.parse("2023-03-01T13:00:00Z");
       String exerciseSolved = exercise.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY));
        System.out.println(exerciseSolved);
    }
}
