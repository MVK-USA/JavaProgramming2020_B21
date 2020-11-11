package day14_Switch_Recap;

public class If_Practice {

    public static void main(String[] args) {
        int age = 14;
        if(age>=14){

        }

        System.out.println("=================");

        int num =6; //1~7

        if(num ==1) System.out.println("Today is Monday");
        else if(num==2) System.out.println("Today is Tuesday");
        else if(num==3) System.out.println("Today is Wednesday");
        else if (num==4) System.out.println("Today is Thursday");
        else if (num==5) System.out.println("Today is Friday");
        else if (num==6) System.out.println("Today is Saturday");
        else System.out.println("Today is Sunday");

        System.out.println("==========================");

        int Age =35;
        if(Age<21){
            System.out.println("Teenager");
        }else if(Age >=21 && Age <=55){
            System.out.println("Adult");
        }else{
            System.out.println("Senior");
        }




    }
}

