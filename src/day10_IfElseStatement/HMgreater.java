package day10_IfElseStatement;

public class HMgreater {

        public static void main(String[] args) {

            int a =1;
            int b =2;
            boolean a1 = a>b;
            boolean b1 = a<b;

            String number = " is greater";
            if(a1){
                System.out.println(a+number);
            }
            if(b1){
                System.out.println(b+number);
            }
            System.out.println("===================");
            int a2 = 5;
            int b2 = 7;
            int max = 0;
            String number2 =" is greater";

            if (a2>b2){
                max=a2;
            }else{
                max=b2;
                System.out.println(max+number2);
            }

/*
 int max = 0;
            String number2 =" is greater";

            if (a>b){
                max=a;
            }else{
                max=b;
                System.out.println(max+number2);
            }
 */
System.out.println("====================================");





        }
}





