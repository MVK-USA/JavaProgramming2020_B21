package day11_MultiBranchIf;

public class DaysInWeek2 {

    public static void main(String[] args) {
        int number = 5;


        String dayOfTheWeek = (number==1)? "Monday":(number==2)? "Tuesday"
                :(number==3)?"Wednesday":(number==4)?"Thursday":(number==5)?"Friday"
                :(number==6)?"Saturday":"Sunday";
        System.out.println(dayOfTheWeek);
        /*
         int number = 1; //1~7;
        String day=" ";

        if(number==1){
            day="Monday";
        }else if(number==2){
            day="Tuesday";
        }else if(number==3){
            day="Wednesday";
        }else if(number==4){
            day="Thursday";
        }else if(number==5){
            day="Friday";
        }else if(number==6){
            day="Saturday";
        }else{
            day="Sunday";


        }
        System.out.println(day);
         */
    }
}
