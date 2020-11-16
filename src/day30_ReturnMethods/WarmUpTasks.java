package day30_ReturnMethods;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;

public class WarmUpTasks {

    public static void main(String[] args) {
        positiveNegativeZero(123);
        positiveNegativeZero(0);
        positiveNegativeZero(-10);

        System.out.println("===================================");
        int[] numbers = {1, 2, 3, 4, -5, -6, -7, -8, 10, 11, 0};

        for (int i = 0; i <= numbers.length - 1; i++) {
            positiveNegativeZero(numbers[i]);
        }

        System.out.println("======================================");

        gradeCalculator(85);

        //positiveNegativeZero(-120);
        //   gradeCalculator(-120);

        System.out.println("======================================");
        int[] a1 = {10,50, 60, 70};
        int[] a2 = {20, 90, 100};

        combineTwoArrays(a1, a2);

        System.out.println("=======================================");
        removeDuplicates("aaaaabbbbbbbbbaaaaccccccccbbbbbbbbbdddddd");

        String str = "pppppooooooiiiiuuuuuuyyyyttttttt";
        removeDuplicates(str);

        System.out.println("===========================");

        formattedFullName("cYbErTeK", "SCHOOL");

    }

    // task 1. create a function that can check if the given integer is positive, negative or zero

    public static void positiveNegativeZero(int number) {
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
    public static void combineTwoArrays(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];
        int i = 0; //repesents the index num of arr3

        for (int each : arr1) {
            arr3[i++] = each; // each elements of arr1 is being assigned to the index of the third aray
        }

        // i=2
        for (int each : arr2) {
            arr3[i++] = each; // each elements of arr2 is being assigned to the index of the third aray
        }

        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));
    }

    // task 4. create a function that can print a string without the duplicated characters
    //                                    "aabccb"
    public static void removeDuplicates(String str) {
        String result = "";  //"abc"

        for( int i = 0; i <= str.length()-1; i++  ){
            if(!result.contains( ""+str.charAt(i) )){
                result += str.charAt(i);
            }
        }
              /*  if(result.contains(each)){              //   2й вариант
                    continue;                           //
                }else{
                    result+= each;
                } */

                System.out.println(result);


        }

        // task 5.  write a method that can print out the full name of a person in reugral format
    //            ex: fullName("cYbErTeK", "SCHOOL");
    //                output: "Cybertek School"
    //                                   "cYbErTeK"
    public static void formattedFullName(String first, String last){
      first =  first.substring(0,1).toUpperCase() + first.substring(1).toLowerCase();   //"Cybertek"
        last =  last.substring(0,1).toUpperCase() + last.substring(1).toLowerCase();    // "School"

       String fullName = first+" "+ last;

        System.out.println(fullName);

    }


    }



