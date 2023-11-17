package Java;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;


public class Date_1 {

    public static void main (String []args){
      OffsetDateTime exercise = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        System.out.println(exercise.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
        System.out.println(exercise.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        System.out.println(exercise.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));

    }

}
