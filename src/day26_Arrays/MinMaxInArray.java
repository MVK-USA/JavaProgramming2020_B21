package day26_Arrays;

import java.util.Scanner;

public class MinMaxInArray {

    public static void main(String[] args) {
        /*
            finding min and max from array
             */
        Scanner scan = new Scanner(System.in);
        System.out.println("How many number would you like to enter?");
        int length = scan.nextInt();

        int[] numbers = new int[length];

        for (int i = 0; i <= length - 1; i++) {//gets the user inputs and stores into the array starting from i
            System.out.println("Enter a number");
            numbers[i] = scan.nextInt();

        }
        int min = numbers[0];
        int max = numbers[0];

        for (int i = 0; i <= length - 1; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
            System.out.println("max: " + max);
            System.out.println("min: "+ min);



    }
}
