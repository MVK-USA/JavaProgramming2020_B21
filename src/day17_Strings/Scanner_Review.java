package day17_Strings;
import java.util.Scanner;

public class Scanner_Review {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Pick a number from 1 to 10");
        int num = input.nextInt();

        if(num> 0 && num<11) {


            System.out.println("Can you enter that number as a word?");
            String word = input.next();//accept one word
            boolean areMatching = false;
            switch(word){
                case "one":
                    areMatching =(num==1);
                    break;
                case "two":
                    areMatching =(num==2);
                    break;
                case "three":
                    areMatching = (num==3);
                    break;

            }

if(areMatching) {
    System.out.println("Number: " + num);
    System.out.println("Word: " + word);
}else{
    System.out.println("The two inputs do not match");
}

        }else{
            System.out.println(num +" invalid number");
        }

    }
}
