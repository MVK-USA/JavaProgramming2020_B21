package day07_UnaryOperators;

public class EvenlyDivisibility {

    public static void main(String[] args) {

        int number = 30;

        int remainderOf2 = number % 2;
        int remainderOf3 = number % 3;
        int remainderOf5 = number % 5;
        boolean divisibleBy2 = remainderOf2 < 1; //1 < 1;
        boolean divisibleBy3 = remainderOf3 <1; // 2 < 1;
        boolean divisibleBy5 = remainderOf5 < 1; // 0 < 1;



        System.out.println(number + " divisible by 2: "+divisibleBy2);
        System.out.println(number+ " divisible by 3: "+ divisibleBy3);
        System.out.println(number + " divisible by 5: "+ divisibleBy5);

        System.out.println(remainderOf2);



        /*
        Divisibility, write a program that can check if a number is evenly divisible by 2, 3, 5,
            Ex:
                number = 65;  ==> int
                divisible By 2 ==> true/false
                divisible By 3 ==> true/false
                divisbile By 5 ==> true/false
            output:
                65 is divisible by 2: false
                65 is divisible by 3: false
                65 is divisible by 5: true
                number = 80;
            output:
                80 is divisible by 2: true
                80 is divisible by 3: false
                80 is divisible by 5: true
         */

    }

}
