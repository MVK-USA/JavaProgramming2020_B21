package day26_Arrays;

public class MaximumNumberInArray {

    public static void main(String[] args) {
        
        int[] numbers = {300, 100, 400, 5000, -150};
        int max = numbers[0];
        
        for (int i =0; i<= numbers.length-1; i++){
            if(numbers[i]>max){
                max = numbers[i];
            }
        }
        System.out.println("max = " + max);
        
         
        /*
        write a program that can return the maximum number from an array of integers

         */
    }
}
