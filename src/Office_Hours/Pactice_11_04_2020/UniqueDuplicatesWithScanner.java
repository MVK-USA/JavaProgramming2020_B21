package Office_Hours.Pactice_11_04_2020;
import java.util.Scanner;
public class UniqueDuplicatesWithScanner {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a String");
        String str = scan.next();
        String unique = "";  //bd
        String duplicates = "";



        for(int j=0; j<=str.length()-1; j++) {

            char ch = str.charAt(j); // 'a', 'a', 'b', 'c', 'c', 'd'
            int frequency = 0;
            for (int i = 0; i <= str.length() - 1; i++) {
                if (str.charAt(i) == ch) {
                    frequency++;
                }
            }
            if (frequency == 1) { //if frequency is 1, it means the ch is unique
                unique += ch;
            }
            if(frequency>1 && !duplicates.contains("" + ch)){ //
                duplicates += ch;
            }
        }
        System.out.println(unique);
        System.out.println(duplicates);
    }
}



