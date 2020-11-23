package day32_LocalDate_WrapperClass;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
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

    LocalTime:
    hours: hh
    minutes: mm
    seconds: ss
    am/pm: a
     */

    public static void main(String[] args) {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("MM/dd/yy EEEE");

        LocalDate today = LocalDate.now(); //2020-11-23
        System.out.println(today);

        System.out.println(today.format(df));


        DateTimeFormatter tf = DateTimeFormatter.ofPattern("hh:mm:ss a");
        LocalTime now = LocalTime.now();

        System.out.println(now);

        System.out.println(now.format(tf));

        LocalTime t1 = LocalTime.of(23,35,55);
        System.out.println(t1);
        System.out.println(t1.format(tf));

        //
        // Monday 12:40 pm  Nov/23/2020
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE, hh:mm a, MMM/dd/yyyy");
        LocalDateTime dt1 = LocalDateTime.of(2020,11,23,12,40);

        System.out.println(dt1);
        System.out.println(dt1.format(dtf));


    }
}
