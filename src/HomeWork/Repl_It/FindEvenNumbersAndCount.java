package HomeWork.Repl_It;

import java.util.Arrays;
import java.util.Scanner;

public class FindEvenNumbersAndCount {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int[] nums = new int[10];
        for (int i = 0; i <= 9; i++) {
            nums[i] = input.nextInt();
        }

        int countEven = 0;
        for (int i = 0; i <= 9; i++) {
            int eachNumber = nums[i];
            if (eachNumber % 2 == 0) {
                countEven++;
            }
        }

        System.out.println(countEven);

    }
}