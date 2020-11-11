package day08_ShortHand_Relational;

public class KgToPounds {

    public static void main(String[] args) {

        int kg =100;
        double pounds = kg * 2.20462; // int pounds = (int)(kg * 2.20462);
        int result = (int)pounds;

        System.out.println(kg+ " kg equal to "+result+ " pounds");
        /*
                        kg = 100;
                output:
                    10 kg equal to 220 pounds
            Hint: 1kg = 2.20462 pounds
         */
    }
}
