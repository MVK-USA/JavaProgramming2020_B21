package day14_Switch_Recap;

public class HW_MonthName {

    public static void main(String[] args) {
        int monthNum = 13;

        String nameOfMonth = (monthNum==1)? ": January": (monthNum==2)?": Febraury"
                :(monthNum==3)? ": March": (monthNum==4)?": April"
                :(monthNum==5)?": May":(monthNum==6)?": June"
                :(monthNum==7)?": July": (monthNum==8)?": August"
                :(monthNum==9)? ": September": (monthNum==10)?": October"
                :(monthNum==11)?": November":(monthNum==12)?": December"
                :"Invalid number!";

        System.out.println(nameOfMonth);


    }
}
