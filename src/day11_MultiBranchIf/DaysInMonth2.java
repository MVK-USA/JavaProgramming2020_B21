package day11_MultiBranchIf;

public class DaysInMonth2 {
    public static void main(String[] args) {
        int month = 12; //1 to 12

        boolean has28Days = month ==28;  // month ==2
        boolean has30Days = month ==30; //month ==4 ||month ==6 || month ==9 || month ==11||month==12;


        int days= 0;

        if(has28Days){
            System.out.println("28 days");  //days =28;
        }else if(has30Days){
            System.out.println("30 days"); //days =30;
        }else{
            System.out.println("31 days"); //days =31; ==> sout(days+ " days");


            System.out.println(" ===========Ternary===============");

            int days2 = (has28Days)? 28: (has30Days)? 30: 31;

            System.out.println(days2+" days");
        }
    }
}
