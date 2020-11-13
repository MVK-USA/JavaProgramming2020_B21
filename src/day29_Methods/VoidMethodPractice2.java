package day29_Methods;

import java.util.*;

public class VoidMethodPractice2 {

    public static void main(String[] args) {
        sumOf3Nums(10, 20, 30);
        sumOf3Nums(40, 30, 10);

        //    sumOf3Nums(scan.nextInt(), scan.nextInt(), scan.nextInt());
        greaterNum(100, 105);
    }

    public static void sumOf3Nums(int n1, int n2, int n3) {
        System.out.println("Sum is: " + (n1 + n2 + n3));


    }

    public static void greaterNum(int n1, int n2) {

        if (n1 > n2) {
            System.out.println(n1 + " is greater");
        } else if (n2 > n1) {
            System.out.println(n2 + " is greater");
        } else {
            System.out.println("Equal numbers");
        }
    }
}
/*
 1. write a method that calculates the sum of 3 numbers
 2. write a method that shows
 */