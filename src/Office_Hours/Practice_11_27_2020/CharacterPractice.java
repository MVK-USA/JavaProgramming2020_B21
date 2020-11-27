package Office_Hours.Practice_11_27_2020;

public class CharacterPractice {

    public static void main(String[] args) {


                for(int i=1; i<= Character.MAX_VALUE; i++) {
                    char each = (char) i;
                    if (Character.isLetter(each)) {
                        System.out.print(each + " ");
                    }
                }
    }
}
