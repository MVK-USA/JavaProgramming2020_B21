package day15_Scanner;

import java.util.Scanner;

public class Scanner_ByteLongBoolean {

    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);

        System.out.println("Please enter your age: ");
         byte age = info.nextByte();

        System.out.println("Please enter your favourite number: ");
         long number = info.nextLong();

        System.out.println("Are you a student? Enter true or false");
         boolean student = false;

        System.out.println("Age: "+ age);
        System.out.println("Favourite number: "+ number);

        if(student){
            System.out.println("Great, you are a student!");
        }else{
            System.out.println("Oh ok, you are not a student!");
        }
        System.out.println(student);

                 /*
                 Ask the user to enter their age (byte),
                 ask them to enter their favorite number (long),
                 and ask them if they are a student (boolean).
                 Print all the values from the inputs
                  */

    }
}
