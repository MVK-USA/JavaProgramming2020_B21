package day28_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArrays {

    public static void main(String[] args) {

        int[] arr1 = {1, 2};
        //            0 1
        int[] arr2 = {3, 4, 5, 6, 7};
        //            0 1 2 3 4
        int[] arr3 = {8, 9, 10, 11, 12, 13};
        //            0 1  2  3  4  5
        int[][] arrays = {arr1, arr2, arr3};
        //                   0     1     2
        // retrieve the element:6
        System.out.println(arrays[1][3]);
        // retrieve the element: 8
        System.out.println(arrays[2][0]);
        //retreive the elements: {3,4,5,6,7}
        System.out.println(Arrays.toString(arrays[1]));//  1D array

        //print entire arrays:
        System.out.println(Arrays.toString(arrays));
        System.out.println(Arrays.deepToString(arrays));

        System.out.println("===========String Array===========");
        String[][] batch21 = {
                {"Lily", "Lana", "Igor"},   //0

                {"Polina", "Serhii", "Abdujilil", "Aziz", "Halzat"},  //1

                {"Justyna", "Adil", "Ercan", "Irina", "Med", "Olesea", "Vlad", "Asuman", "Guvanch"},//2

        };


        for (int i = 0; i <= batch21.length - 1; i++) { // i: index numbers of 1D arrays

            System.out.println(Arrays.toString(batch21[i]));

            for (int j = 0; j <= batch21[i].length - 1; j++) {  // j: index numbers of elements of each 1D arrays
                System.out.println(batch21[i][j]);
            }
            System.out.println("=====REVERSE============");
            String[][] batch21A = {
                    {"Lily", "Lana", "Igor"},   //0

                    {"Polina", "Serhii", "Abdujilil", "Aziz", "Halzat"},  //1

                    {"Justyna", "Adil", "Ercan", "Irina", "Med", "Olesea", "Vlad", "Asuman", "Guvanch"},//2

            };

            String reverseName = "";
            for (int i1 = batch21A.length - 1; i1>=0; i1--) { // represents the index num of 1D arrays
                for(int j =batch21A[i1].length-1; j>=0; j--){ // j represents index number of elements
                    System.out.print(batch21A[i1][j] + " ");
                }
            }


        }
    }
}
