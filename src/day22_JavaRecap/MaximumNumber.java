package day22_JavaRecap;
import java.util.Scanner;
public class MaximumNumber {

    public static void main(String []args){
        /*
        write a program that asks user to enter 5 numbers and retuns the maximum number

        scanner object: 1
        max: 1

        "enter a number": 5
        nextInt(): 5
        "maximum number is....": 1
         */
        
        Scanner scan = new Scanner(System.in);
        int max = -9999999;  
        // user most likely to enter  that greater than -9999999
        
        for(int i=1; i<=5; i++){
            System.out.println("Enter a number: ");
            int n = scan.nextInt();    //-1, 3, 4, 5....
           
           if(n> max){
               max = n;
           }
        }
        scan.close();

        System.out.println("max = " + max);
        
    }

}
