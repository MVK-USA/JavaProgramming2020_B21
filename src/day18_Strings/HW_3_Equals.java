package day18_Strings;

public class HW_3_Equals {

    public static void main(String[] args) {
        String a = "java";


        char firstChar = a.charAt(0);
        char LastChar = a.charAt(a.length()-1);

if (firstChar==LastChar){
    System.out.println("same");
}else{
    System.out.println("not same");
}

        /*
        write a program that can check if
        the first and last characters of the string are same
            ex:
                level
            output:
                same
                java
            output:
                not same
         */
    }
}
