package day18_Strings;

public class HW_2_initials {

    public static void main(String[] args) {
String firstName = "cybertek";
String lastName = "school";

 String initial = firstName.substring(0,1).toUpperCase()
          +"."+lastName.substring(0,1).toUpperCase();
        System.out.println(initial);

        /*
        write a program that can return the initials of the user
            ex:
                cybertek
                school
            output:
                C.S

         */
    }
}
