package day20_ForLoop;

import java.util.Scanner;
public class HW_PrintThreeLetterMiddle {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = scan.next();



        if(word.length()%2==1 && word.length()>5){
            System.out.println(word.substring((word.length()+1)/2-2,(word.length()+1)/2+1));
        }else{
            System.out.println("invalid");
        }


    }
}
