package Java;

import java.time.DayOfWeek;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Date_3 {
    public static void main (String []args){
        OffsetDateTime exercise = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        System.out.println("The year is " + exercise.format(DateTimeFormatter.ofPattern("YYYY").withLocale(Locale.ITALY)));
        System.out.println("The month is " + exercise.format(DateTimeFormatter.ofPattern("MMMM").withLocale(Locale.ITALY)));
        System.out.println("The day of the month is " + exercise.format(DateTimeFormatter.ofPattern("dd").withLocale(Locale.ITALY)));
        System.out.println("The day of the week is " + exercise.format(DateTimeFormatter.ofPattern("EEEE").withLocale(Locale.ITALY)));
    }
}
