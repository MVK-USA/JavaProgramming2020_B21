package day10_IfElseStatement;

public class IfStatement {

    public static void main(String[] args) {
        int score = 45;
        if(score >=60){

            System.out.println("Congrats");
        }
        if(score<60){
            System.out.println("Keep trying");
        }

        System.out.println("===============");
        int angle1 = 80;
        int angle2 = 75;
        int angle3 = 65;
        int angle4 = 75;

        boolean isValidRectangle = angle1 == 90 && angle2 ==90 && angle3 ==90 && angle4 ==90;
        // if each of the angles are equal to 90, then it's valid
       if(isValidRectangle){
           System.out.println("It is valid rectangle");
       }else{
           System.out.println("It is not valid rectangle");
       }
        System.out.println("=====================");
       int a = 25000;
       int b = 3000;
       int max = 0; //?

       //what is the maximum number

        if(a>b){
            max = a;
        }else{
            max=b;
        }
        System.out.println("Maximum number is: "+max);


    }
}
