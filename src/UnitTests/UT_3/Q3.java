package UnitTests.UT_3;

public class Q3 {
    public static void main(String[] args) {
        method3(50);
    }

    public static String method3(int num){
        if(num<0){
            return "Less0";
        }else if(num<50){
            return"Less50";
        }else if(num<100){
            return "Less100";
        }else{
            return "oth";
        }
    }
}
