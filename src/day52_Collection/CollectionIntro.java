package day52_Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionIntro {

    public static void main(String[] args) {

       Collection<Integer> numbers = new ArrayList<Integer>();
        System.out.println(numbers.size());

       numbers.add(100);


       numbers.addAll(Arrays.asList(200, 300, 400, 500));



    }
}
