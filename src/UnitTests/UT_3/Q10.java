package UnitTests.UT_3;

import java.util.Scanner;

public class Q10 {
    public static int action(){
        return  0;
    }

    public static int action(int i){
        return i*2;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tot =0;
        tot+=action(scan.nextBoolean());
        tot+=action(scan.nextInt());
        tot+=action();
        tot+=action(scan.next());
        tot+=action(scan.next());
        System.out.println(tot);
    }
    public static int action(String s){
        return s.length();
    }
    public static int action(boolean b){
        if(!b){
            return 5;
        }else
            return 10;
    }
}
