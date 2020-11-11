package day08_ShortHand_Relational;

public class RelationalOperators {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        boolean r1 = num1> num2;
        boolean r2 = num1<num2;
        boolean r3 = num2> num1;
        boolean r4 = num2< num1;

        System.out.println(num1+" is greater than "+num2+" :"+r1);
        System.out.println(num1+" is greater than "+num2 +" :"+r2);
        System.out.println(num2+" is less than "+num1 +" :"+r3);
        System.out.println(num2+" is less than "+num1 +" :"+r4);

        System.out.println("====================================================");
        System.out.println(10>9);
        System.out.println(10< 9);
        System.out.println("==========================================");
        // >=, <=;

        System.out.println(10>10); // false
        System.out.println(10>=10); //10 is greater or equal to 10 ==> true

        System.out.println(10<9);// false
        System.out.println(10<=9); // 10 is less or equal to 9 ==> false

        System.out.println("===================================");
        // ==  !=
        boolean b1 = 10==10; //true;
        boolean b2 = 10!= 10; // false
        System.out.println(b1);
        System.out.println(b2);

        boolean b3 = "Cybertek" == "Virginia"; //false
        boolean b4 = "Virginia" == "virginia"; //false
        System.out.println(b3);
        System.out.println(b4);

        boolean b5 = "Muhtar" == "Good boy"; //false
        System.out.println(b5);

        boolean b6 = "Muhtar" != "Good Guy"; // true
        System.out.println(b6);

        int x = 100;
        boolean isEven = x % 2 == 0; // 100 is evenly devisible by 2
        // even number: if a number can be evenly divisible by 2 with 0 remainder

        boolean isOdd = x % 2 != 0; //opposite of even

        System.out.println(isEven);
        System.out.println(isOdd);









    }
}
