package HomeWork.Repl_It;
import java.util.*;
public class LongestWordInArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = new String[5];

        for (int i = 0; i < 5; i++) {

            words[i] = input.nextLine();
        }
            String longestWord = words[0];
            
            for(int i=1; i< words.length; i++){
                String max = words [i];
                if(max.length() > longestWord.length()){
                    longestWord = max;

                }
            }
            System.out.println(longestWord);


    }
}

