package Java;

import java.time.LocalDate;
import java.time.OffsetDateTime;

public class Date_5 {
    public static void main (String[]args){
        OffsetDateTime firstDate = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime secondDate = OffsetDateTime.parse("2024-03-01T13:00:00Z");
        System.out.println("Is " + firstDate + " before " + secondDate + " ? " + firstDate.isBefore(secondDate));
        System.out.println("Is " + secondDate + " after "+ firstDate + " ? " + secondDate.isAfter(firstDate));
        System.out.println("Is " + firstDate + " now ? " + firstDate.equals(LocalDate.now()));
        System.out.println("Is " + secondDate + " now? " + secondDate.equals(LocalDate.now()));
    }
}
