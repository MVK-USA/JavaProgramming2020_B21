package Office_Hours.Practice_01_06_2021;

import java.io.FileNotFoundException;

public class ExceptionTypes {
    public static void main(String[] args) {

        System.out.println("Test started");
        String str = null;

       // System.out.println(str.charAt(0)); // unchecked

        //throw new IllegalStateException(); // unchecked

        // throw new FileNotFoundException(); // checked

        System.out.println(25/0);



    }
}
