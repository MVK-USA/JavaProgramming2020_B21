package day26_Arrays;

public class FrequencyOfEachChars2 {

    public static void main(String[] args) {
        String str = "aaabbc           aa          bb";//"a3b2c1"
        str = str.replace(" ", ""); // jaust if we need to ignore the space
        String expectedResult = ""; //"a3b2c1"

        for (int j = 0; j <= str.length() - 1; j++) {

            char ch = str.charAt(j);
            int count = 0;
            for (int i = 0; i <= str.length() - 1; i++) { // i represents the index of str
                char eachChar = str.charAt(i);
                if (eachChar == ch) {
                    count++;
                }
            }
            if (!expectedResult.contains("" + ch)) {
                expectedResult += "" + ch + count;
            }
        }

        System.out.println(expectedResult);


    }
}

