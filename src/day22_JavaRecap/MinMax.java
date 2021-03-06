package day22_JavaRecap;
import java.util.Scanner;

public class MinMax {

    public static void main(String[] args) {
        /*
    write a program that asks user to enter 5 numbers and returns the minimum and maximum numbers

         */

        Scanner scan = new Scanner(System.in);
        int min = 2147483647;
        int max = -2147483647;

        for(int i = 1; i<=5; i++){
            System.out.println("Enter a number");
            int n = scan.nextInt();

            if( n< min){
                min = n;
            }
            if( n > max){
                max = n;

            }
        }

        scan.close();

        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}
