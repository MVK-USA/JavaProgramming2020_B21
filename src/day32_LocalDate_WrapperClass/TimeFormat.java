package day32_LocalDate_WrapperClass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import  java.time.format.DateTimeFormatter;
import java.util.zip.DataFormatException;

public class TimeFormat {
    /*
    LocalDate:
    year: yy or yyyy
    month: MM(NUMBER), MMM(first 3 letters), MMMM(full name of the month)
    days: dd

    name of day: E(3 letters); EEEE (FULL NAME)

    Month/ Day /Year
     */

    public static void main(String[] args) {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("MM/dd/yy EEEE");

        LocalDate today = LocalDate.now(); //2020-11-23
        System.out.println(today);

        System.out.println(today.format(df));

    }
}
