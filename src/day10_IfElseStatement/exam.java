package day10_IfElseStatement;

public class exam {

    public static void main(String[] args) {
        float    a   =  100.987_6543f;

        short  b  =  (byte) a ;

        byte  c   = (byte) b;
        System.out.println(c);

        System.out.println("==============");
        int a1 = 3,  b1 = 2;

        long c1 = (a1+b1) * 2 / 3 % 2 ;
        System.out.println(c1);

        System.out.println("===========");
        long a2 =3_000l;
        double b2 = (float)a2;
        int c2 = (short)b2;
        System.out.println(c2%1000);
        System.out.println("======");

        System.out.println(10/3);
        System.out.println(10/3.0);
        System.out.println (  (int)(10.0/3)   );

    }
}
