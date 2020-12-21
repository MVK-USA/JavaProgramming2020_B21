package UnitTests.UT_3;

import java.util.Scanner;

public class Q8 {

    public static String met9(String one, String two, String three){

        return "" + middle(one) + middle(two) + middle(three);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = met9(scan.next(), scan.next(),scan.next());
        System.out.println(str);

    }
    public static char middle(String s){
        return s.charAt((s.length()/2));
    }
}
