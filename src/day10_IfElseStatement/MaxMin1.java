package day10_IfElseStatement;

public class MaxMin1 {

    public static void main(String[] args) {
        int a = 100;
        int b = 200;

        int max1 = 0;

        if(a>b){
            max1=a;
        }else{
            max1 = b;
        }
        System.out.println(max1);

        int max2 = (a>b)? a : b;
        System.out.println(max2);

        System.out.println("second=================");

        int min1 = 0;
        if(a<b){
            min1 = a;
        }else{
            min1 = b;
                    }
        System.out.println("The minimum number is: "+min1);
        System.out.println("============================");

        int min2 = (a<b)? a : b;
        System.out.println("The minimum number is: "+min2);

        /* 1. write a program that can find the maximum number between two different numbers
            first solution: if & else statement
            second solution: do not use any if statement
    2. write a program that can find the minimum number between two different numbers
            first solution: if & else statement
            second solution: do not use any if statement

         */


      }
}
