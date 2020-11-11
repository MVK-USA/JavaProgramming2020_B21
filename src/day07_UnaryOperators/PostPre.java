package day07_UnaryOperators;

import java.sql.SQLOutput;

public class PostPre {

    public static void main(String[] args) {
        int x = 2;
        int y = x++; // post increment: first passes current value 2
        System.out.println(x); //3
        System.out.println(y); //2

        int x2 = 2;
        System.out.println(x2++); //2
        System.out.println(x2++); //3
        System.out.println(x2++); //4

        int x3 = 2;
        System.out.println(--x3);

        System.out.println("================================================");
        int x4 = 8;
        int y4 = x4--;
        System.out.println(y4);
        System.out.println(x4);

        System.out.println("=============================================");
        int a = 1;
        int b = -a-- + a++/-a-- * --a; //b =-1+0
        System.out.println(a);
        System.out.println(b);

        int A = 50;
        int B = --A + A++ + A-- + A++;

        System.out.println(B);

        System.out.println("===============================");

        int X = 4;
        int Y = X * 4 - X++;
        System.out.println(Y);
        System.out.println("=========================");

        int t = 100;
        int p = - ++t * -t--/ t++ + --t;
        // -101 * -101/ 100 + 100
        System.out.println(p);
        System.out.println("======================================================");

        int R =20;
        int W = -R-- + -R++ + --R * R-- % 2;
        //-19*19 = -361
        //-20 + -19 + 19* 19 %2
        // -39+1 = -38
        System.out.println(W);

        System.out.println("==========================");

        int M = 300;
        int N = 400;
        int U = ++M +N++ - M-- % 2 + --N % 2;
                //U = 301 + 400 - 301 % 2 + 400 % 2
        // U = 701 - 1 + 0 = 700;

        int J = M + N - M * N + M/N;
        //J = 300+ 400 - 300*400 + 300/400;
        // 700 -120000 +
        // -120300 + 1000 =119300;

        System.out.println(J);
        System.out.println(U);










    }
}
