package Office_Hours.Practice_11_11_2020;

import java.util.Arrays;

public class SingleDimensionalArray {

    public static void main(String []args){
        int [] scores = new int[5];
                      // length = 1
                      // last index: 1-1 = 0

        scores[0] = 10;
        scores[1] = 20;
        scores[2] = 50;
        scores[3] = 30;
        scores[4] = 40;

        System.out.println(Arrays.toString(scores));  // [10, 20, 50, 30, 40]
        System.out.println(scores[0]);
        System.out.println(scores[1]);
        System.out.println(scores[2]);
                    // i < 5
        for(int i = 0; i<= scores.length-1; i++){
            System.out.print(scores[i]+" ");

                    }
        System.out.println();
        System.out.println("===============================");

        int j = 0;
        for(int each: scores){  //each: element
            scores[j]= j+1;
            j++;
        }
        System.out.println(Arrays.toString(scores));





    }
}
