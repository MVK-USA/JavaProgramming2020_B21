package HomeWork.Repl_It;

import java.util.*;

public class VendingMachine_034 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int itemPrice, change;
        int quarters, dimes, nickels;

        System.out.println("Enter price in cents:");
        itemPrice = scan.nextInt();

        if(itemPrice <25 || itemPrice > 100){
            System.err.println("Invalid price!");
        }else if(itemPrice %5 !=0){
            System.err.println("Invalid price!");
        }else{
            change = 100 - itemPrice;
            quarters = change/25;

            int remainingAfterQuarter = change%25;
            dimes = remainingAfterQuarter/10;

            int remainingAfterDimes = remainingAfterQuarter % 10;
            nickels = remainingAfterDimes/5;

            System.out.println("Your change is "+quarters+ " quarters, "+dimes +" dimes, and "
                            +nickels+" nickels.");

        }
    }
}
