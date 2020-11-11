package day08_ShortHand_Relational;

public class GallonsToLiters {

    public static void main(String[] args) {
        int gallons = 100;
        double liters = gallons * 3.785;
        int result = (int)liters;

        System.out.println(gallons + " gallons equal to "+ liters+" liters");
        System.out.println(gallons + " gallons equal to "+ result+" liters");

         /*
         gallons: 100
                    output:
                        100 gallons equal to 378 liters
                Hint: 1 gallon = 3.785 liters
                   */

    }

}
