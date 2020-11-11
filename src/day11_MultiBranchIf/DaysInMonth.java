package day11_MultiBranchIf;

public class DaysInMonth {

    public static void main(String[] args){
        int month = 3; //1 to 12

        boolean has28Days = month ==28;  // month ==2
        boolean has30Days = month ==30; //month ==4 ||month ==6 || month ==9 || month ==11;
        boolean has31Days = !has28Days && !has30Days;

        if(has28Days){
            System.out.println(28+ " days");
        }
        if(has30Days){
            System.out.println("30 days");
        }
if(has31Days){
    System.out.println("31 days");
}



        /*
        write a program that can find the number of days in a month
        (Assume that Feb has 28 days)
            Ex:
                month = 3
                output:
                    31 days
                month = 9
                output:
                    30 days
        Hints: it cannot be done with if&else statement, you will need single if statements
        28 days: 2
        30 days: 4, 6, 9, 11
        31 days: 1, 3, 5, 7, 8, 10, 12
         */
    }

}
