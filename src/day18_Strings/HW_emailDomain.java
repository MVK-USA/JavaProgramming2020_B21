package day18_Strings;

import java.util.Scanner;

public class HW_emailDomain {

    public static void main(String[] args) {

        String a = "test@gmail.com";
        int begIndex = a.indexOf("@")+1;
        int endIndex = a.indexOf(".com");
        String domain = a.substring(begIndex, endIndex);

        System.out.println("the domain of the email: "+domain);

        String b = "Cybertek@yahoo.com";
        int begIndex1 = b.indexOf("@")+1;
        int endIndex1 = b.indexOf(".com");
        String domain1 = b.substring(begIndex1, endIndex1);

        System.out.println("the domain of the email: "+ domain1);


        /*
           write a program that will return the domain
        of an email address:
            Ex:
                input: test@gmail.com
                output: the domain of the email is: gmail
                inputL: Cybertek@yahoo.com
                output: the domain of the email is: yahoo

         */
    }
}
