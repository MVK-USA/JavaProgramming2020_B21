package day14_Switch_Recap;

public class HW_EvenOdd {

    public static void main(String[] args) {
        int num = 100;

        boolean even = num % 2 == 0;
        boolean odd = !even;

        if (even) {
            System.out.println(num + "_is even");
        }
        if (!even) {
            System.out.println(num + "_ is odd");
        }
        /*
        The variable "num" holds an integer user input

Write a conditional statement starting on line 9 that does the following:
If num is even (divisible by 2), print "__ is even"
If num is odd, print "__ is odd"

Examples:
In: 23
23 is odd
In: 36
36 is even
         */
    }
}
