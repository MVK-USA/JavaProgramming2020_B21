package day30_ReturnMethods;

public class WarmUpTasks {

    public static void main(String[] args){

        pozitiveNegativeZero(-15);
        pozitiveNegativeZero(0);
        pozitiveNegativeZero(15);

        int[] numbers = {1,2,3,4,-5, -6, -7, -8, 10, 11,0};

        for(int each:numbers){
            pozitiveNegativeZero(each);
        }
    }
 // task 1. create a function that can check if the given integer is positive, negative or zero

    public static void pozitiveNegativeZero(int number){
        String result = (number>0)?"Positive": (number<0)? "Negative" : "Zero";

        System.out.println(number+ " is " + result);

    }

}
/*
 1. create a function that can check if the given integer is positive, negative or zero
    2. create a function that can calculate the garde of the student
    3. create a function that can print out the combination of two integer arrays
    4. create a function that can print a string without the duplicated characters
    5.  write a method that can print out the full name of a person in reugral format
            ex:
               fullName("cYbErTeK", "SCHOOL");
                output:
                    "Cybertek School"

 */