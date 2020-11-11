package Office_Hours.Practice_10_28_2020;
import java.util.Scanner;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String str = "abab";

        String nonDup = "";
        // if the character is not exist in nonDup, when we can concate it
        for(int i =0; i < str.length(); i++){
            //str.charAt(i);
            if(!nonDup.contains("" +str.charAt(i))){
                nonDup += str.charAt(i);

            }
        }

    }
}
