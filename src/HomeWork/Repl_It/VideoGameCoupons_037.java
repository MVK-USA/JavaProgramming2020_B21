package HomeWork.Repl_It;

import java.util.Scanner;

public class VideoGameCoupons_037 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of coupons: ");

        int coupons = scan.nextInt();
        if (coupons < 3) {
            System.out.println("Not enough coupons");
        } else {

            int candyCount = coupons / 10;
            int remainingCoupons = coupons % 10;
            int gumballsCount = remainingCoupons / 3;


            System.out.println("Number of Candies: " + candyCount);
            System.out.println("Number of Gumballs: " + gumballsCount);
        }

    }
}
/*
The video game machines at your local arcade output coupons according to
how well you play the game. You can redeem 10 coupons for a candy bar or 3
coupons for a gumball. You prefer candy bars to gumballs. Write a program that
defines a variable initially assigned to the number of coupons you win. Next,
the program should output how many candy bars and gumballs you can get if
you spend all of your coupons on candy bars first, and any remaining coupons
on gumballs.

if you the coupons are not enough for any redeem, display message:
"Not enough coupons"
 */