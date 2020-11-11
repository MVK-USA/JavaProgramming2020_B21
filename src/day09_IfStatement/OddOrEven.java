package day09_IfStatement;

public class OddOrEven {

    public static void main(String[] args) {
        int number = 1000;
        boolean even = number% 2 == 0;
        boolean odd = !even;

        System.out.println(number+ " is even number: " +even);
        System.out.println(number+ " is odd number: "+odd);

        System.out.println("==================================");

        int n = 200;

        boolean isPositive = n> 0;
        boolean isNegative = n <=0;
        boolean isZero = !isPositive;

        System.out.println(n+ " is positive: "+ isPositive);
        System.out.println(n+" is negative: "+ isNegative);
        System.out.println(n + " is zero: "+isZero);
        System.out.println(false == !true);
        System.out.println(false != true && !false == true);
        System.out.println(!false !=false);

        String weather = "Shinny";
        int degree =70;

        boolean r1 = !(weather == "Rainy" || degree ==70);
        System.out.println(r1);

        System.out.println(!! true); // true
        System.out.println(!!! false); //true
        System.out.println(!!!!!!!false); // true


    }
}
