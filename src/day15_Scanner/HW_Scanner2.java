package day15_Scanner;

import java.util.Scanner;

public class HW_Scanner2 {

    public static void main(String[] args) {
        /*
        Create a program that will take two int numbers
         and multiply them. Print in the following way:
    %numOne x %numTwo = %result
    Ex: 3,5 --> 3 x 5 = 15
    Ex: -2,30 --> -2 x 30 = -60
         */
        Scanner input = new Scanner(System.in);

        System.out.println("numOne is: ");
        int numOne = input.nextInt();
        System.out.println("numTwo is: ");
        int numTwo = input.nextInt();
        int result = numOne * numTwo;

        System.out.println(result);

    }
}
