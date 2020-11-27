package Office_Hours.Practice_11_27_2020;

import java.util.ArrayList;
import java.util.Arrays;

public class FindUniques {

    public static void main(String[] args) {

        String[] arr = {"A", "B", "A", "C", "D", "D"};

        ArrayList<String> uniqueElementList = new ArrayList<>();
        for (String element : arr) {

            int count = 0;
            for (String each : arr) {
                if (each.equals(element)) {
                    count++;
                }
            }

            if (count == 1) {
                uniqueElementList.add(element);
            }
        }
        String[] uniques = new String[uniqueElementList.size()];
        for (int i = 0; i <= uniques.length - 1; i++) {
            // each element of the array list need to be assigned to each index
            uniques[i] = uniqueElementList.get(i);
        }


        System.out.println(uniqueElementList);
        System.out.println(Arrays.toString(uniques));

        String[] names = {"Ahmed", "Muhammed", "John", "Ahmed", "John", "Daniel"};
        String[] result1 = uniques(names);

        System.out.println(Arrays.toString(result1));

    }

    public static String[] uniques(String[] arr) {
        ArrayList<String> uniqueElementList = new ArrayList<>();
        for (String element : arr) {

            int count = 0;
            for (String each : arr) {
                if (each.equals(element)) {
                    count++;
                }
            }

            if (count == 1) {
                uniqueElementList.add(element);
            }
        }
        String[] uniques = new String[uniqueElementList.size()];
        for (int i = 0; i <= uniques.length - 1; i++) {
            // each element of the array list need to be assigned to each index
            uniques[i] = uniqueElementList.get(i);
        }
        return uniques;
    }
}

