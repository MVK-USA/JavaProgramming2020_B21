package HomeWork.Repl_It;

import java.util.Scanner;

public class PrintFirstAndLastLetters_062 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        char firstLetter = word.charAt(0);
       // int charCount = word.length();
        //int lastCharIndex = charCount - 1;
        char lastLetter = word.charAt(word.length()-1);

        System.out.println(firstLetter);
        System.out.println(lastLetter);




    }

}
/*
Write a program that will print out first and last letters together.

adobe
ae
 */