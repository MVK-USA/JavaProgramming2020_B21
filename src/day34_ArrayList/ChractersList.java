package day34_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ChractersList {

    public static void main(String[] args) {
         String str = "abcd@!#$etyi123lkjhaqwer%^&879";
        ArrayList<String> digits = new ArrayList<>(Arrays.asList(str.split("")));
        digits.removeIf(p->!Character.isDigit(p.charAt(0)));
        System.out.println(digits);

        ArrayList<String> letters = new ArrayList<>(Arrays.asList(str.split("")));
        letters.removeIf(p->!Character.isLetter(p.charAt(0)));
        System.out.println(letters);

        ArrayList<String> specialCharacters = new ArrayList<>(Arrays.asList(str.split("")));
        specialCharacters.removeIf((p ->Character.isLetterOrDigit(p.charAt(0))));
        /*specialCharacters.removeAll(digits);    // 2 variant resheniya zadachi
        specialCharacters.removeAll(letters);*/
        System.out.println(specialCharacters);

    }
}
