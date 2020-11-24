package day33_ArrayList;

public class WrapperClassPractice {

    public static void main(String[] args) {
        String str ="a1b2c3";
        int sum = 0;
        
        for(char each:str.toCharArray()){
            if(Character.isDigit(each)){
                sum += Integer.parseInt(""+each); // each digits need  to be converted to integer and then it would added to the sum
            }
        }
        System.out.println("sum = " + sum);

        System.out.println("=====================================================");

        String password = "Password#7";

        String upperLetters = "";
        String lowerLetters = "";
        String digits = "";
        String specialChar = "";

        for(char each:password.toCharArray()){  // verify if the character is upper case
            if(Character.isUpperCase(each)){
                upperLetters += each;
            }else if(Character.isLowerCase(each)){ //verify if the character is lower case
                lowerLetters += each;
            }else if(Character.isDigit(each)){ // verify if the character is digit
                digits += each;
            }else{
                specialChar += each;
            }
        }
        System.out.println("upperLetters = " + upperLetters);
        System.out.println("lowerLetters = " + lowerLetters);
        System.out.println("digits = " + digits);
        System.out.println("specialChar = " + specialChar);

        boolean isValid = password.length() >= 8 && upperLetters.length() >0
                && lowerLetters.length()>0 && digits.length()>0 && specialChar.length()>0;

        System.out.println(isValid);
    }

}
/*
write a program that can return the sum of all the digits from a string
            ex:
                input: "a1b2c3"
                output: 6
                    (1+2+3= 6)

 */