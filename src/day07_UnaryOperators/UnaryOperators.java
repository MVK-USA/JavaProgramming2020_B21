package day07_UnaryOperators;

public class UnaryOperators {

    public static void main(String[] args) {

        int a = 100;
        boolean positive = a >= 0; //verify if a is positive
        boolean negative = a < 0; // verify if a is negative;

        System.out.println(a+" is positive number: "+positive);
        System.out.println(a+" is negative number: "+negative);

        int b = -100 - 20; // -120
        System.out.println(b);

        int c = 10 - -20; // +30
        System.out.println(c);

        int d = -10 *4;
        System.out.println(d);

        int x = 100;
        ++x; // 101 increment increase the value by 1 (+1)
        System.out.println(x);

        int y = 100;
        --y; //99 // increment decrease the value by 1 (-1)
        System.out.println(y);

        int z = 100;
        System.out.println(--z);

        int x2 = 100;
        System.out.println(++x2);
        System.out.println("==============================================================");

        int a2 = 100;
        // a--; //100
       // a;  // 99

        int b2 = 100;
        // b++;
       // b; //101

        System.out.println(a2--);
        System.out.println(a2);

        System.out.println(b2++);
        System.out.println(b2);




    }

}
