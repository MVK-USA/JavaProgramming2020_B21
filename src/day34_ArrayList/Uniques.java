package day34_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Uniques {

    public static void main(String[] args) {

         String str = "aabaacddddeffffghhhhhi";

        ArrayList<Character>list = new ArrayList<>();  //getting each character from String and adding it into the ArrayList

        for( char each: str.toCharArray())list.add(each);
        System.out.println(list);

        for(Character each: list){
           if( Collections.frequency(list, each) ==1){
               System.out.print(each+" ");
           }
        }

    }
}
