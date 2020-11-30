package day34_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class FrequencyOfChars {
    public static void main(String[] args) {

        String str = "AAABBCDDDDEEE";
                    // A3B2C1D4E3
        String result = "";

        ArrayList<String> list = new ArrayList<>(); // in order to be able to use frequency method

        for(String each : str.split(""))list.add(each); // we get every character from str and add them into arrayList

        System.out.println(list);

        for(String each:list){
            int frequency = Collections.frequency(list, each);

            if (!result.contains(each)) {
                result += each + frequency;
            }
                                }
        System.out.println(result);
    }
}
