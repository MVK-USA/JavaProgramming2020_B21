package day08_ShortHand_Relational;

public class IdentifyNumber {
    public static void main(String[] args) {

        /*
        number = 100;
        output:
        100 is positive number: true
        100 is negative number: false
        100 is zero: false
                 */
        int a = 100;
        boolean positive = a >0;
        boolean negative = a < 0;
        boolean zero = a == 0;

        System.out.println(positive);
        System.out.println(negative);
        System.out.println(zero);
    }
}
