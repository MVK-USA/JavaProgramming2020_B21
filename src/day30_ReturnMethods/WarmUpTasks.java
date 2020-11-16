package day30_ReturnMethods;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;

public class WarmUpTasks {

    public static void main(String[] args) {


        pozitiveNegativeZero(-15);
        pozitiveNegativeZero(0);
        pozitiveNegativeZero(15);

        int[] numbers = {1, 2, 3, 4, -5, -6, -7, -8, 10, 11, 0};

        for (int each : numbers) {
            pozitiveNegativeZero(each);
        }

        gradeCalculator(80);
        gradeCalculator(-120);

        System.out.println("=========================================");
        int[] a1 = {10, 50, 60,70};
        int[] a2 = {20, 90, 100};

        combineTwoArrays(a1, a2);
    }

    // task 1. create a function that can check if the given integer is positive, negative or zero

    public static void pozitiveNegativeZero(int number) {
        String result = (number > 0) ? "Positive" : (number < 0) ? "Negative" : "Zero";

        System.out.println(number + " is " + result);
        System.out.println("===============================================================");
    }

    //task 2. create a function that can calculate the garde of the student

    public static void gradeCalculator(int score) {
        if (score >= 0 && score <= 100) {

            if (score >= 90) {
                System.out.println("A");

            } else if (score >= 80) {
                System.out.println("B");

            } else if (score >= 70) {
                System.out.println("C");
            } else if (score >= 60) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }
            //2-й ВАРИАНТ РЕШЕНИЯ
            //System.out.println((score>=90)?"A":(score>=80)?"B": (score>=70)?"C":(score>=60)?"D"
            //        :(score>=50)?"E":"F");

        } else {
            System.err.println("Invalid score");


        }
    }

    // task 3. create a function that can print out the combination of two integer arrays
                    //                    {1,2}        {3,4,5}
    public static void combineTwoArrays(int[] arr1, int[] arr2){
        int[] arr3 = new int[arr1.length +arr2.length];
        int i =0; //repesents the index num of arr3

        for(int each : arr1){
             arr3[i++] = each; // each elements of arr1 is being assigned to the index of the third aray
        }

        // i=2
        for(int each: arr2){
            arr3[i++] = each; // each elements of arr2 is being assigned to the index of the third aray
        }

        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));
    }

}

/*


    4. create a function that can print a string without the duplicated characters
    5.  write a method that can print out the full name of a person in reugral format
            ex:
               fullName("cYbErTeK", "SCHOOL");
                output:
                    "Cybertek School"

 */