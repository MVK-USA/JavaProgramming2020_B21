package HomeWork;

import java.util.Arrays;

public class UniqueNumberFromIntegerArray {

    public static void main(String[] args){

        int[] number = {2,2,5,5,3,7,2,7};
        String unique = "";
        for (int i=0; i< number.length; i++){
            int frequency = 0;
           int s1 = number[i];
           for(int j= 0; j< number.length; j++){
               if(s1 == number[j]){
                   frequency++;
               }
           }
           if(frequency==1){
               unique+= s1;
           }
        }
        System.out.println("unique = " + unique);


        /*
        write a program that can find the unique numbers from an integer array
         */
    }

}
