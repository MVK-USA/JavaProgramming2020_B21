package day19_ForLoop;

public class ForLoopPractice {

    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            System.out.print(i + " ");

        }
        System.out.println();
        System.out.println("Hello");

        System.out.println("======number=between=1000=2000=====");
        for (int i=100; i<=200; i++){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Hello");

        System.out.println("===odd==number=for=loop========");
        //odd numbers: 1,3,5,7......
for (int i=1; i<=100; i+=2){ //for (int i=0; i<=100; i++){ if(i%2!0){
    System.out.print(i+" ");
}
        System.out.println();
        System.out.println("=======even==number==ForLoop=====");
for (int i=0; i<=100; i+=2){
    System.out.print(i+" ");

    System.out.println("==================");
    for(int a =0; a<=100; a++){
        if(a%2==0){
            System.out.println(a+" ");
        }
        System.out.println();
        System.out.println("==========================");

        for(int b =1; b <=50; b++){
            System.out.println("Push Up "+b);
        }
        System.out.println();

        char a1 =65;
        System.out.println(a1);


    }
}

            /*
            tasks:
            1. print out the numbers between 0~1000;
            2. print out the numbers between 1000~2000;
            3.print out all the odd numbers between 0~1000;
            4. print out all the even numbers between 0~1000;
            5. do 50 push ups
            6. write a program that can print a ~z in same line separated by space
            7. write a program that can print A ~Z in same line separated by space
            8. print out the first 30000 characters in same line separeted by space

             */

    }
}
