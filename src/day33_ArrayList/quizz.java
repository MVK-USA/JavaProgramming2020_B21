package day33_ArrayList;

import java.util.Arrays;

public class quizz {

    public static void main(String[] args) {
        char[] array = {'D','C', 'A','B'};
        Arrays.sort(array);

        for(char each:array){
            System.out.println(each+" ");
            if(each=='D'){
                continue;
            }
        }

    }

}
