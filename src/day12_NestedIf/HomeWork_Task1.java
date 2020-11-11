package day12_NestedIf;

public class HomeWork_Task1 {

    public static void main(String[] args) {
        int n =8;
        String number ="";

        if(n<=9 && n>=0) {
        if(n==1) {
            number = "ONE";
        }else if(n==2){
            number ="TWO";
        }else if (n==3){
            number = "THREE";
        }else if (n==4) {
            number ="FOUR";
        }else if(n==5){
            number = "FIVE";
                    }else if(n==6){
            number = "SIX";
        }else if(n==7){
            number = "SEVEN";
        }else if(n==8){
            number = "EIGHT";
        }else if(n==9){
            number = "NINE";
        }
        }else{
            System.out.println("INVALID NUMBER");
        }
        System.out.println(number);
        /*
        1. write a java program that can convert numbers between 0 ~ 9 to words,
        if the number is greater than 9 or less than zero, out put should be "Invalid".
            Note: MUST USE NESTED IF

         */
    }
}
