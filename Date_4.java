package Java;

import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Date_4 {
    public static void main (String[]args){
        OffsetDateTime exercise = OffsetDateTime.parse("2023-03-01T13:00:00Z");
       OffsetDateTime exercisesolved =exercise.plusYears(1).minusMonths(1).plusDays(7);
        System.out.println(exercisesolved.format(DateTimeFormatter.ofPattern("dd MMMM YYYY", Locale.ITALY)));

    }
}
