package day06_ArithmeticOperators;

public class ArithmeticOperators {

    public static void main(String[] args) {

        System.out.println(10/4);  //2
        System.out.println("10/4"); // put it as a text 10/4

        System.out.println(12+3.0);  //15.0
        System.out.println((12+3));  //15
        System.out.println("12"+3);  //123 concatenation

        System.out.println('a'+3); // addition, every single char has corresponding number

        System.out.println(12.0 -4); //8.0

        double a = 12.0/3;
        System.out.println(a);

        int b = 10/3;
        System.out.println(b);

        double c = 10/3;
        System.out.println(c);

        double d = 10/3.0;
        System.out.println(d);

        //int x =3/2;

        System.out.println(3/2);

        double y =3/2;
        System.out.println(y);  // y = 1.0

        double z = 3.0/2; //or we can put 3f/2 -as float or 3d/2 as a decimal.
        System.out.println(z);

        //remainder: 10-(3*3) = 1
        // remainder = numerator - (denominator*whole number of the result)
        System.out.println(100%13);
        System.out.println(100%10);

        System.out.println(20%4.5);


    }
}
