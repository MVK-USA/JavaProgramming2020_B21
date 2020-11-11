package day20_ForLoop;

import java.util.Scanner;
public class BreakContinue {

    public static void main(String[] args) {

        for(int i=1; i<=10; i-- ){

            if(i <1){
                break; //exits the loop immediately
            }
            System.out.println("Hello Batch 21");
        }
        System.out.println("==============================");
        Scanner scan = new Scanner(System.in);

        for(int i=0; i==0;) {


            System.out.println("Enter two numbers: ");
            int n1 = scan.nextInt();
            int n2 = scan.nextInt();
            System.out.println("Sum is: " + (n1 + n2));

            System.out.println("Would you like to continue? Yes, No");
            String answer = scan.next();

            if(answer.equalsIgnoreCase("no")){
                System.out.println("Thank you for using our calculator");
                break;
            }
        }

        /*
        1. ask user to enter 2 numbers and then print the sum of those 2 numbers
        2. would you like to continue
        if yes --> repeat previous steps
        if no--> exit the loop
         */
    }
}
