package day10_IfElseStatement;

public class MinimumNumber {

    public static void main(String[] args) {
        int n1 =200;
        int n2 =100;
        int n3 =300;

        boolean n3IsMin = n3 < n1 && n3< n2; // if n3 less than both n1 & n2, it means that n3 is the minimum
        boolean n2IsMin = !n3IsMin && n2 < n1; // n2 < n1 && n2 < n3;
        boolean n1IsMin = !n3IsMin && !n2IsMin; //n1 < n3 && n1 < n2;
        String imn = " is minimum number";
        int min = 0;

        if(n3IsMin){
            System.out.println(n3 + imn);
            min=n3;
        }
        if(n2IsMin){
            System.out.println(n2+imn);
            min = n2;
        }
        if(n1IsMin){
            System.out.println(n1+imn);
            min = n1;
        }

        System.out.println(min+imn);
        /*
        Task03: MinimumNumber
         write a java program that accepts three numbers and return the minimum number
                (assume that none of them are equal)

         */
    }
}
