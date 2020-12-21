package UnitTests.UT_3;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int size = input.nextInt();

        int[] a = new int[size];
        int i = 0;

        while (i < size) {
            a[i++] = input.nextInt();

        }
        meth8(a);
    }
        public static void meth8(int[] arr){

            for(int n:arr){
                if(n%4 ==0){
                    continue;
                }
                System.out.println(n);
            }
        }

    }

