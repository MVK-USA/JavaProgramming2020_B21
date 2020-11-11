package day07_UnaryOperators;

public class Kahoot {

    public static void main(String[] args) {

        System.out.print("Result A"+ 0 +1);
        System.out.print("; Result B "+ (1)+ (2));

        System.out.println();

        System.out.print("5+2= "+3+4);
        System.out.print("; 5+2= "+(3+4));

        System.out.println();

        float a =100.9876543f;
        short b = (byte)a;

        System.out.println(b);


        System.out.println((3+2) * 2/3 % 2);
        //5*2/3%2 = 10/3 =3 %2 = 1;

             long a8 = 3_000L;
             double b8 = (float)a8;
        System.out.println(b8);
              int c8 =(short)b8;

        System.out.println(c8 %1000);

        double a7 = 10/3;
        System.out.println(a7);
        //=====================================


        System.out.println();

        int a4 = 10;
        int b4 = 20;
        int c4 = 30;
        a4 =          c4 = a4 *b4;
        System.out.println(a4+""+ b4+""+ c4);


        





    }
}
