package day23_NestedLoop;

public class DoWhileLoopPractice {

    public static void main(String[] args) {
        /*
        even numbers between 1~20
         */

        for(int i =1; i<=20; i++){
            if(i%2 !=0) {
                System.out.println(i);
            }
        }
        System.out.println("=============do while loop==========");
        int i=1;
        do {

            if(i%2 !=0){
                System.out.print(i+" ");
            }
            i++;
        }while (i<=20);

    }
}
