package day08_ShortHand_Relational;

public class UnaryPractice {

    public static void main(String[] args) {
        int a = 100;
        int b = -a++ + ++a - a-- * a-- %2;
        System.out.println(b);
        /*
        int a = 100;
       int b = -a++ + ++a - a-- * a-- % 2
         */
    }
}
