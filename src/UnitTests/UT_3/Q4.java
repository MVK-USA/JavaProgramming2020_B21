package UnitTests.UT_3;

public class Q4 {
    public static void main(String[] args) {
        int result = method4('z',"zebra");
        System.out.println("result");
    }
    public static int method4(char c, String s){
        if(s.contains(""+c)){
            return 1;
        }else{
            return 0;
        }
    }
}