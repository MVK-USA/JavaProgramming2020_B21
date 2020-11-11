package day15_Scanner;

import java.util.Scanner;

public class Scanner_Decimal {

    public static void main(String[] args) {

        Scanner decimal = new Scanner(System.in);

        System.out.println("Enter a float number");
        float floatNumber = decimal.nextFloat();

        System.out.println("Number is: "+floatNumber);
    }
}
