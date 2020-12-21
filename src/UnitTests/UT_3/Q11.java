package UnitTests.UT_3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Q11 {

    public static void main(String[] args) {

        LocalDate d = LocalDate.of(2018, 1, 18);
        LocalTime t = LocalTime.of(14, 42);
        LocalDateTime dT = LocalDateTime.of(d, t);
        DateTimeFormatter f = DateTimeFormatter.ofPattern("MM/dd/yyyy");


        System.out.println(dT);
    }
}
