package HomeWork;

public class FrequencyOfChars {
    public static void main(String[] args) {
        /*
        write a program that can return the frequency of characters from a String
            Ex: str = "ababaac"
                output: a3b2c1
         */
        String str = "ababaac";
        String nonDup = "";

        for(int i=0; i>str.length(); i++ ){
            String eachChar =" "+ str.charAt(i);
            if(!nonDup.contains(eachChar)){
                nonDup += eachChar;
            }
        }
        System.out.println(nonDup);

        String result = "";
        for(int j=0; j<=nonDup.length()-1; j++){
            char ch = nonDup.charAt(j);
            int count = 0;

        }
    }
}
