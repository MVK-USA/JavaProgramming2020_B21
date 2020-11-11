package day25_ArrayIntro;

public class UniqueCharacters {

    public static void main(String[] args) {

        String s = "abcabbeb";
        String result =""; //"ce"

        for(int j =0; j < s.length(); j++) { // j represent the index num of s


            char ch = s.charAt(j); //'a'
            int count = 0; //1
            for (int i = 0; i < s.length(); i++) { // I represents the index num of s
                char eachChar = s.charAt(i); // each character of the string
                if (eachChar == ch) {
                    count++;
                }
            }  // count the frequency of ch
            if (count == 1) {  // if the frequency is one, it means it's unique
                result += ch;
            }
        }
        System.out.println(result);




                }
}
