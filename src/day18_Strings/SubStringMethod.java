package day18_Strings;
import java.util.Scanner;

public class SubStringMethod {

    public static void main(String[] args) {
        String str = "I love JAVA Programming";
        str = str.substring(7, 11);
        System.out.println(str);

        System.out.println("==============");

        String str1 = "Today is Monday";
        String day = str1.substring(9, 14+1);
        System.out.println(day);

        System.out.println("================");

        String email = "cybertek@gmail.com";
        //              0123456789
        String domain = email.substring(9, 14);
        System.out.println("Domain of the email " +email +" is: "+domain);
        String s1 = "I like movies and books";
        //           0123456789
        String word1 = s1.substring(7, 13);
        System.out.println(word1);

        System.out.println("=============");

        String firstName = "mArWaN"; //Marwan
        String firstChar = firstName.substring(0, 1).toUpperCase();
        String rest = firstName.substring(1, firstName.length()-1+1).toLowerCase();

        System.out.println(firstChar);
        System.out.println(rest);

        firstName = firstChar + rest;

        System.out.println(firstName);

        System.out.println("===========");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String f = scan.nextLine();

        f = f.substring(0,1).toUpperCase()+f.substring(1, f.length()-1+1).toLowerCase();

        System.out.println("Enter your last name: ");
        String l = scan.nextLine();

        l = l.substring(0,1).toUpperCase()+ l.substring(1, l.length()-1+1).toLowerCase();
        System.out.println("first name is: " + f);
        System.out.println("last name is: "+l);




    }
}
