package Office_Hours.Practice_12_02_2020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SecondMaxMin {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,1,1,2,3,4,5,6,7,8,9,10,10,10));

        list.removeAll(Arrays.asList(Collections.max(list), Collections.min(list))); //removes all the max numbers

        int secondMax = Collections.max(list);
        int secondMin = Collections.min(list);

        System.out.println("secondMax = " + secondMax);
        System.out.println("secondMin = " + secondMin);

        /*
        summary:
        to find secondMax number: first we remove all the max number
        the next max number will be the second max number
         */
        

    }
}
