package Quizzes;

public class Q1 {

    public Q1(){
        System.out.println("A ");

    }
    public Q1(int a){
        this(2.5);
        System.out.println("B ");
    }
    public Q1(double c) {
        this();

        System.out.println("C ");
    }

    public static void main(String[] args) {
        Q1 obj = new Q1(100);
    }
}
