package day21_WhileLoop;
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        int result =0; //5+10=15+20=35

        for(int i=0; i<1;){ //true
            System.out.println("Enter a number: ");
            int num = scan.nextInt(); //5, 10, 20
            result += num;
            if(num<0){
                break;
            }

        }
        scan.close();
        System.out.println("result: " + result);
    }

}
/*
Write a program that calculates the sum of numbers entered by the user until user enters a negative number.
            hint: you need an infinite loop

 */