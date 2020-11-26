package HomeWork;

import java.util.Arrays;

public class OddDevided5 {
    public static void main(String[] args) {
        int num = 100;

        for (int i = 0; i <= 100; i++) {//This loop will help us get access to all the numbers from zero to 100
int count3 = 0;
int count5 = 0;

            if (i % 2 != 0 && i % 3 == 0) {//Someone can add the print statement
                System.out.println(i);
            }else if(i%2 != 0 && i % 5 ==0){
                System.out.println("odd number divisible by 5: " + i);
            }

        }

    }
}
