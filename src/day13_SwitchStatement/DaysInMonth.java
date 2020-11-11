package day13_SwitchStatement;

public class DaysInMonth {

    public static void main(String[] args) {
        int year = 2020;
        int month = 2; // 1~12

        boolean has28Or29days = month == 2;
        boolean has30days = month ==4 ||month ==6 ||month == 9||month == 11;


        String result = " ";

        if (month > 0 && month < 13) { //1~12

        } else {  // if the month is invalid
            result = "Invalid Month";
        }
        System.out.println(result);

        System.out.println("==========================");

        int year1 = 2020;
        int month1 = 3;
        boolean has28Or29days1 = month == 2;
        boolean has30days1 = month ==4 ||month ==6 ||month == 9||month == 11;


        String result1 = " ";

        if (month > 0 && month < 13) {
            if (has28Or29days1) {
                if (year % 4 == 0) { // leap year
                    result1 = "29 days";
                } else {
                    result = "28 days";
                }

            } else if (has30days1) {
                result1 = "30 days";
            } else {
                result1 = "31 days";

            }
            System.out.println(result1);
        }
    }
}


