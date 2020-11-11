package day15_Scanner;

import java.util.Scanner;
// import day14_Switch_Recap.SalaryCalculator;
// if we wanted to use the SalaryCalculator in this class.

public class Scanner_Int {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // scanner object called scanner
        System.out.println("Enter number one:");
        int numOne = scanner.nextInt(); //reading an int number

        System.out.println("Enter number two:");
        int numTwo = scanner.nextInt(); // reading an int number

        System.out.println("Number one: "+numOne);
        System.out.println("Number two: "+numTwo);
        System.out.println("Sum: "+(numOne+numTwo));

    }
}
