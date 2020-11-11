package day20_ForLoop;
import java.util.Scanner;

public class PalindromeTest{

    public static void main(String[] args) {
        /*
        write a program that can verify if the user entered String is palindrome
            ex:
                input: Level
                output: Level is palindrome
                input: java
                output: java is not palindrome
         */
Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String word = scan.nextLine();

        String result = "";

        for(int i=word.length()-1; i>=0; i--){
        result += word.charAt(i);
        }
        System.out.println("result: "+result);
        if(result.equalsIgnoreCase(word)) {
            System.out.println(word + " is palindrome ");
        }else{
            System.out.println(word + " is not palindrome ");
        }
/*...*/
        System.out.println(word + (result.equalsIgnoreCase(word)
        ?" is palindrom":" is not palindrom"));
    }
}

