package day10_IfElseStatement;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class ShortHand {

    public static void main(String[] args) {
        int a = 100;

        System.out.println(a);
        System.out.println(++a);

        a = 200;

        System.out.println(a);
        System.out.println(++a);

        a= 300;
        System.out.println(a);
        System.out.println(++a);

        System.out.println("================");
        String name = "Daniel";
        System.out.println(name);

        name = "John";
        System.out.println(name);

        // +=
        int A = 200;
            // A = A + 100;
            A += 100; // THE ADDITION WILL BE ASSIGNED TO THE VARIABLE
        System.out.println(A);

        String school ="Cybertek";
        //school= school + "School";
        school += " School";
        System.out.println(school);

        int savingAccount = 1000;
        // october;
        savingAccount += 2000;
        System.out.println(savingAccount);

        savingAccount += 500; // november
        System.out.println(savingAccount);

        // -=;
        savingAccount -= 1000;
        System.out.println(savingAccount);

        savingAccount -= 500;
        System.out.println(savingAccount);

        //*=;

        double salary = 100000.5;
        salary *= 1.2;
        System.out.println(salary);

        int y = 10;
        y *= 10;
        System.out.println(y);

        // /=;

        double tax = 10000;
        tax /= 2;
        System.out.println(tax);

        int B = 3000;
        B /= 1;
        System.out.println(B);

        // %=;
        // remainder: if numerator can't be evenly divisible by denominator
        /*
        in math: 10/4 = 2.5;
        remainder: 10 - (4*2) =2;

        in java:
        10 % 4 ==> 2;
                 */
        int T = 100;
        T %= 10;
        System.out.println(T);

        double U = 35;
        U %= 9;
        System.out.println(U);





    }
}
