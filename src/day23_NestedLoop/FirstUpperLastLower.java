package day23_NestedLoop;

public class FirstUpperLastLower {

    public static void main(String[] args) {
        String str = "Cybertek";

        char f = str.charAt(0);
        char l = str.charAt(str.length()-1);

        boolean start = f>= 65 && f<=90; // aski table // true
        boolean end = l >= 97 && l <=122; // aski table // true

        if(start && end){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
        /*
         Write a program that asks user to enter a string.
         If string started with uppercase and ends with lowercase letter then print true,
         otherwise print false
        Ex:Input: Cybertek
           output: true
           Input: CyberteK
           output: false
         */
    }
}
