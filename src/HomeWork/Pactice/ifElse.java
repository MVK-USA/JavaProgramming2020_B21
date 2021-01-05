package HomeWork.Pactice;

public class ifElse {

    public static void main(String[] args) {

        int year = 2021;

        if(year%4 ==0){
            System.out.println(year + " is Leap year");
        }else{
            System.err.println(year + " is NOT Leap year");
        }
        System.out.println("===================================");

        int a = 200;
        int b = 350;
        int max = 0;

        if(a>b){
            System.out.println(a + " is MAX");
        }else{
            System.out.println(a + " is MIN");
        }
    }
}
