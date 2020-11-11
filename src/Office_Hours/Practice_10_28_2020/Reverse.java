package Office_Hours.Practice_10_28_2020;

import java.util.Scanner;

public class Reverse {

    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();

        scan.close();
        String result =" ";

        /*...*/

        for(int i = name.length()-1; i>=0; i--){
            // result  += name.charAt(i);
            result+= name.substring(i, i+1);
        }
    }

}
