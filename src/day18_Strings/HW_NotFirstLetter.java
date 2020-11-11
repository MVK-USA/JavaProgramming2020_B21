package day18_Strings;

import java.util.Scanner;

public class HW_NotFirstLetter {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("Enter a word: ");
        String str = scan.nextLine();

        String result = str.substring(1, str.length());

        /*
        Ask user to enter a word.
        If the first or second or both letter of the word is x,
        print the word without x(s).
        If x is the third letter it should be printed.
        If the first and second are x, both should be ignored.
                    Input:
                        xxode
                    Output:
                        ode
                        Input:
                        oxidex
                    Output:
                        oidex


         */
    }
}
