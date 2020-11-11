package Office_Hours.Pactice_11_04_2020;

public class UniquesAndDuplicates {

    public static void main(String[] args) {

        String str = "aabccd";
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
            if(frequency>1){ //
                duplicates += ch;
            }
        }
        System.out.println(unique);
        System.out.println(duplicates);
    }
}
