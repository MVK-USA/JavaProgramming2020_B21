package day29_Methods;

import java.util.Arrays;

/*
   AM specifier  returnType methodName(Parameter) { }
 */
public class VoidMethodPractice {

    public static void main(String[] args) {
        int[]a1 = {100,-200, 300, 50, 40, 59, 700, 0, 1, 2};

        arrayMaxNum(a1);

        int[] a2 = {1,2,3,4,5,6,7,800,9,0,1,12,13,4};

        arrayMaxNum(a2);

    }

    public static void arrayMaxNum(int[] arr){
        /*Arrays.sort(arr);
        System.out.println("Maximum number: "+arr[arr.length-1]);
        */
         int max = arr[0];
         for (int each:arr){
             if(each>max){
                 max=each;
             }
         }
        System.out.println("Maximum number is: "+ max);
    }
}
/*
    1. create a function that can print out the maximum number from any given integer array
    2. create a function that can print out the minimum number from any given integer array
    3. create a function that can print the unique elements from the array

 */