package day10_IfElseStatement;

public class Relational {

    public static void main(String[] args) {

        System.out.println(10 > 100); // false

        System.out.println(100 < 10); // false

        System.out.println(10000 > 20);
        System.out.println(20< 10000);

        System.out.println(10 >= 8);
        System.out.println( 9 >= 9);
        System.out.println( 10<=10);
        System.out.println( 10 <=5);

        //==
        int a1 = 20;
        int a2 = 30;
        int a3 = 30;

        System.out.println(a1==a2);
        System.out.println(a2==a3);

        char ch1 ='!';
        char ch2 = '!';
        System.out.println(ch1==ch2);

        String language1 = "Turkish";
        String language2 = "Indian";
        String language3 = "turkish";
        System.out.println(language1 == language2);
        System.out.println(language1 == language3);

        //!=
        System.out.println("Russian language == Japanese languge");
        System.out.println("Russian language != Japanese language");




    }

}
