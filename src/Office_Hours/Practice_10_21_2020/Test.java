package Office_Hours.Practice_10_21_2020;
import java.util.Scanner;
public class Test {

    public static void main (String []args) {

        Scanner scan= new Scanner(System.in);

        boolean isTall = scan.nextBoolean();
        boolean isFast = scan.nextBoolean();
        boolean isFlex = scan.nextBoolean();
        String sport ="";

        if(isTall) {
            if (isFast) {
                sport = "basket";
            } else if (isFlex) {
                sport = "g";
            } else {
                sport = "v";
            }
        }else{
            if(isFast){
                sport = "soccer";
            }else{
                sport = "tennis";
            }
        }


        System.out.println(sport);
    }


    }


