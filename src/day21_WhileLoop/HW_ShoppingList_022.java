package day21_WhileLoop;
import java.util.Scanner;

public class HW_ShoppingList_022 {

    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Item1 and its price:");
        String item1 = scan.nextLine();
        double price1 = scan.nextDouble();

        scan.nextLine();

        System.out.println("Enter Item2 and its price:");
        String item2 = scan.nextLine();
        double price2 = scan.nextDouble();
        scan.nextLine();

        System.out.println("Enter Item3 and its price:");
        String item3 = scan.nextLine();
        double price3 = scan.nextDouble();

        scan.nextLine();

        String report = "Item1: "+item1+ "Price: "+price1+","+"Item2:"+item2+" Price: "
                +price2+"," +"Item3: "+item3+"Price: "+price3;
        double totalPrice = price1+price2+price3;
        System.out.println(report +"Total price: "+" "+totalPrice);

        System.out.println("=============repl.it===============");
/*
        Scanner scan = new Scanner(System.in);

        String item1, item2, item3;
        double price1, price2, price3;


        System.out.println("Enter Item1 and its price:");
        item1 = scan.next();
        price1 = scan.nextDouble();

        System.out.println("Enter Item2 and its price:");
        item2 = scan.next();
        price2 = scan.nextDouble();


        System.out.println("Enter Item3 and its price:");
        item3 = scan.next();
        price3 = scan.nextDouble();

        String report = "Item1: "+item1+ " Price: "+price1+", "+"Item2: "+item2+" Price: "
                +price2+", " +"Item3: "+item3+" Price: "+price3;
        double totalPrice = price1+price2+price3;

        System.out.println(report);
        System.out.println("Total price: "+totalPrice);
*/


    }
}





