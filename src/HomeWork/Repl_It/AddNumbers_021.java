package HomeWork.Repl_It;

import java.util.*;

public class AddNumbers_021 {

    public static void main(String[] args){

        int num1, num2, num3;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 3 numbers:");

        num1 = scan.nextInt();
        num2 = scan.nextInt();
        num3 = scan.nextInt();

        int valueOfSum = num1+num2+num3;
        System.out.println("Sum of numbers: "+ valueOfSum);

    }

}
/*
In this assignment you will create a Scanner object and ask user to enter 3 number inputs.

-Declare integer variables num1, num2, num3, sum.

-Create a Scanner object named scan.

-Display prompt "Enter 3 numbers:"

-Using scanner object let user input 3 numbers

-Add 3 numbers and assign to sum variable

-Print "Sum of numbers: ValueOfSum"


 */