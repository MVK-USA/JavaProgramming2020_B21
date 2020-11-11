package day21_WhileLoop;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class StringReverse {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a String");
        String word = scan.nextLine(); //java
                                      // 0123


        int lastIndex = word.length()-1;
        for (int i =lastIndex; i>=0; i--){
            System.out.print(word.charAt(i));
        }
        System.out.println("===========2 variant===============");


        /*String reversedWord = "";
        int lastIndex1 = word.length()-1;
        for (int i =lastIndex1; i>=0; i--){
            reversedWord +=(word.charAt(i));

        }
        System.out.println(reversedWord);
    */
    }
}
