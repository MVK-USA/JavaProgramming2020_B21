package day15_Scanner;

import java.util.Scanner;

public class HW_scanner1 {

    public static void main(String[] args){

        /*
        Ask the user to enter their height (double),
        shoe size (byte),and if they like to wear hats (boolean).
         Print out the information
         */

        Scanner input = new Scanner(System.in);

        System.out.println("User's height: ");
        double height = input.nextDouble();

        System.out.println("User's shoe size: ");
        byte shoeSize = input.nextByte();

        System.out.println("Is user wear hats? - ");
        boolean isHats = false;

        System.out.println("User's height is: "+height+" cm");
        System.out.println("User's shoe size is: "+shoeSize);
        System.out.println("User wear hats: "+ isHats);

    }
}
