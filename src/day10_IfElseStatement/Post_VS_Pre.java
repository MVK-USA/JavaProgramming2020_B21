package day10_IfElseStatement;

public class Post_VS_Pre {

    public static void main(String[] args){
        //pre
        int x =7;
        System.out.println(++x); //8
        System.out.println(x);

        System.out.println(--x); //7

        System.out.println("=============================");
        double y = 7;
        System.out.println(y++); //7.0
        System.out.println(y);   //8.0

        System.out.println(y--); //8.0
        System.out.println(y); //7.0
    }

}
