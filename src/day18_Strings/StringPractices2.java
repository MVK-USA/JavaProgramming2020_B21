package day18_Strings;

import java.util.Scanner;

public class StringPractices2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name of Apple product");
        String product = scan.nextLine(); //remove all spaces out
        product = product.replace(" ", "").toLowerCase();
        // maC  boOK == macbook
        switch (product){
            case "macbook":
                System.out.println("Which model of MacBook would you like?");
                String model = scan.nextLine();
                if(model.equalsIgnoreCase("air")){
                    System.out.println("MacBook Air is $2400");
                }else if(model.equalsIgnoreCase("pro")) {
                    System.out.println("MacBook Pro is $2500");
                }else{
                    System.err.println("Invalid Model for MacBook");
                }
                break;
            case "iphone":
                System.out.println("Which model of Iphone do you want?");
                String model12 = scan.nextLine().toLowerCase();
                if(model12.equals("12")){
                    System.out.println("Iphone 12 is $1000");
                }else if(model12.equals("11")){
                    System.out.println("Iphone 11 is $900");
                }else if(model12.equals("10")){
                    System.out.println("Iphone 10 is $800");
                }else if(model12.equals("8")){
                    System.out.println("Iphone 8 is $700");
                }else{
                    System.err.println("Invalid Model for Iphone");
                }
                break;
            case "ipad":
                System.out.println("Which Model of Ipad?");
                String model3 = scan.nextLine().toLowerCase();
                switch(model3){
                    case "air":
                        System.out.println("Ipad air is $500");
                        break;
                    case "pro":
                        System.out.println("Ipad pro is $400");
                        break;
                    case "mini":
                        System.out.println("Ipad mini is $300");
                        break;
                    default:
                        System.err.println("Ivalid model for Ipad");

                }
                break;
            default:
                System.out.println("Invalid product Name");
        }



        /*
        MacBook:
         air: 2400
         pro: 2500
        IPhone:
        12: 1000
        11: 900
        9: 800
        8: 700

        IPad:
        air: 500
        mini: 400
        pro: 300
         */

    }
}
