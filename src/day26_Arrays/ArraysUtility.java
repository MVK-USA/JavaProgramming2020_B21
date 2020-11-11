package day26_Arrays;

import java.util.Arrays;

public class ArraysUtility {

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6};

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers [2]);
        System.out.println(numbers[3]);
        System.out.println(numbers [4]);
        System.out.println(numbers);

        System.out.println(Arrays.toString(numbers));


        String[] classMates ={"Mariia","Adil","Mohammed","Nesdet","Daniel" };
        System.out.println(Arrays.toString(classMates));

        //sort method

        int[] arr1 ={200, 1000000, 30, 40000, 50000, 0, 35};

        Arrays.sort(arr1); //doesn't return any value, can't be assigned to a variable nor pass it in print method
        System.out.println(Arrays.toString(arr1));
        System.out.println("Max: "+arr1[arr1.length-1]);
        System.out.println("Min: "+arr1[0]);

        double[] arr2 = {1.5, 0.5, 3.5, -0.75, 10.5, -0.5};
    Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

        System.out.println("Second min number: "+arr2[1]);
        System.out.println("Second max number: "+arr2[arr2.length-1-1]);


        String[] names ={"Haroon", "Nurahmet", "Livio", "Dean", "Ayah", "afrooz", "me"};

        Arrays.sort(names);

        System.out.println(Arrays.toString(names));

        //equals(arr1,arr2)

        int[] a1 ={1,2,3};
        int[] a2 = {1,2,3};

        Arrays.sort(a1);
        Arrays.sort(a2);

        boolean r1 = Arrays.equals(a1, a2);
        System.out.println(r1);






    }
}
