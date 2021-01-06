package HomeWork.Repl_It;

import java.util.*;

public class SecondsConverter_032 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int inputSeconds;
        int hours, minutes, seconds;
        //1 hour = 3600 seconds;
        // 1 minute = 60 seconds;

        System.out.println("Enter seconds:");
        inputSeconds = scan.nextInt();

        hours = inputSeconds/ 3600;
      int remainingSecondsAfterHours = inputSeconds % 3600;
      minutes = remainingSecondsAfterHours/60;
      seconds = remainingSecondsAfterHours % 60;

        System.out.println(hours+" hours, "+ minutes+" minutes, and "+seconds+" seconds.");



    }
}
