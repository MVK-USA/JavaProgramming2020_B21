package day14_Switch_Recap;

public class SalaryCalculator {

    public static void main(String[] args) {
        int hourlyRate = 45;
        int weeklyHours = 35;
        int numbersOfWeeks = 50;

        int salary = 0;

        if (hourlyRate > 0) {
            if (weeklyHours > 1 && weeklyHours <= 65) {
                if (numbersOfWeeks > 1 && numbersOfWeeks <= 52) {
                    salary = weeklyHours * hourlyRate * numbersOfWeeks;

            } else {
                System.out.println("number of weeks can't be less than 1 or greater than 52");
            }

        } else {
            System.out.println("Weekly hours can't be less than 1 or greater than 65");
        }


    }else{
            System.out.println("Hourly Rate can't be Negative or 0");
        }

        System.out.println("Your salary is: "+salary);

            }
}



        /*
        1. write a program for the salary calculator
            given info:
                    hourlyRate  40$
                    weeklyHours  45 hours
                    numberofWeeks 48 weeks
            pre conditions: hourlyRate cannot be negative
                            weekly hours cannot be negative or more than 65
                            numberOfWeeks cannot be more than 52 weeks or less than 1
            salary  =  hourlyRate *  weeklyHours * numberofWeeks

         */


