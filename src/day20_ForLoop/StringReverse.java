package day20_ForLoop;

public class StringReverse {

    public static void main(String[] args) {

        String str = "ABCD";
        //            0123456789

        String result = ""; //we want to contain the expected result which is the reversed version of string
        for(int i=3; i>=0; i--){  //also i = str.length()-1
            result += str.charAt(i);
        }
        System.out.println(result);

    }
}
/*
write a program that can reverse any given string
            ex:
                input: abcd
                output: dcba
                input: Cybertek
                output: ketrebyC
 */