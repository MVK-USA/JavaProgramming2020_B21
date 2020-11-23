package day32_LocalDate_WrapperClass;

import java.time.LocalDate;

public class dates {

    public static void main(String[] args) {

        LocalDate yesterday = LocalDate.of(2020, 11, 22);

        System.out.println(yesterday);

        LocalDate d1 = LocalDate.of(2020,2,29);
        System.out.println(d1);

        System.out.println(yesterday.isLeapYear());

        LocalDate today = LocalDate.now();

        System.out.println(today);

        // LocalDate DofB
        String[] names = {"Julia", "Inna", "Anna", "Ruslan", "Livio"};
        LocalDate[] birthday ={
                LocalDate.of(1990, 11, 23),
                LocalDate.of(1995, 02, 10),
                LocalDate.of(2000,03, 15),
                LocalDate.of(2005, 04, 20),
                LocalDate.of(2010,05,25)

        };
        for(int i=0; i <= names.length-1; i++){
            System.out.println(names[i] + " birthday is: " + birthday[i]);

        }




    }
}
