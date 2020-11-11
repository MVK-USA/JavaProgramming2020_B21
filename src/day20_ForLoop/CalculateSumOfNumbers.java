package day20_ForLoop;

import java.util.Scanner;

public class CalculateSumOfNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your number");
        int num = scan.nextInt(); // 100
        int result = 0;

        if (num >= 1) {
            for (int i = 1; i <= 100; i++) {
                //used for calculating the sum and add them into result
                result += i;
            }
            System.out.println("result = " + result);
        }else{
            System.out.println("Invalid number");
        }

    }
}
