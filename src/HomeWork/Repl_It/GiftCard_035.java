package HomeWork.Repl_It;

import java.util.*;

public class GiftCard_035 {

    public static void main(String[] args){

    int giftCard = 100;
    String item;

    Scanner scan = new Scanner(System.in);
    item = scan.nextLine();

        if(item.equals("Smartphone")||item.equals("Laptop")) {
            System.out.println("Sorry, not enough funds on your gift card!");
        }else if(item.equals("Charger")){
            System.out.println("Thank you for your purchase!");
            giftCard = giftCard - 15;
            System.out.println("Your current balance is: "+ giftCard + "$");
        }else if(item.equals("USB cable")) {
            System.out.println("Thank you for your purchase!");
            giftCard = giftCard - 10;
            System.out.println("Your current balance is: " + giftCard + "$");
        }else if(item.equals("Headphones")) {
            System.out.println("Thank you for your purchase!");
            giftCard = giftCard - 30;
            System.out.println("Your current balance is: " + giftCard + "$");
        }else if(item.equals("Pants")) {
            System.out.println("Thank you for your purchase!");
            giftCard = giftCard - 50;
            System.out.println("Your current balance is: " + giftCard + "$");
        }else if(item.equals("Hat")) {
            System.out.println("Thank you for your purchase!");
            giftCard = giftCard - 25;
            System.out.println("Your current balance is: " + giftCard + "$");
        }else if(item.equals("Socks")) {
            System.out.println("Thank you for your purchase!");
            giftCard = giftCard - 5;
            System.out.println("Your current balance is: " + giftCard + "$");
        }else if(item.equals("Blanket")) {
            System.out.println("Thank you for your purchase!");
            giftCard = giftCard - 60;
            System.out.println("Your current balance is: " + giftCard + "$");
        }else if(item.equals("Pillow")){
            System.out.println("Thank you for your purchase!");
            giftCard = giftCard - 40;
            System.out.println("Your current balance is: "+ giftCard + "$");
        }else{
            System.out.println("Invalid item!");
            }
        }

    }


/*
Let's say I've got a 100$ gift card and you want to buy something in your online store.
Write a program that will help me to buy something and display leftover balance after purchase.
If item is not in the list, display message: "Invalid item!".
If price is more than 100$, display message: "Sorry, not enough funds on your gift card!".
Hint
Use if/ else if / else
CODE EXAMPLE:
Example #1
input: Hat
output: Thank you for your purchase!
output: Your current balance is: 75$

Example #2
input: Pants
output: Thank you for your purchase!
output: Your current balance is: 50$

Example #3
input: Laptop
output: Sorry, not enough funds on your gift card!

Example #4
input: Cupcake
output: Invalid item!
List of items

 */