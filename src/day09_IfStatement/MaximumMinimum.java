package day09_IfStatement;

public class MaximumMinimum {

    public static void main(String[] args) {
        int n1 = 100;
        int n2 = 200;

        boolean n1isMax = n1>n2;
        boolean n2isMax = n2>n1;
        boolean equal = !n1isMax && !n2isMax;

        if(n1isMax){
            System.out.println(n1+ " is maximum");
                    }

        if(!n1isMax){
            System.out.println(n1+" is minimum");
        }
      if(n2isMax){
          System.out.println(n2+" is maximum");
      }
      if(equal){
          System.out.println("Both are equal");
      }

        /*
        write a program that can print out the maximum number between two numbers
        Ex:
            num1 = 20;
            num2 = 30;
            output:
                30 is the maximum number
            num1 = 20;
            num2 = 20;
            output:
                both numbers are equal
         */
    }
}
