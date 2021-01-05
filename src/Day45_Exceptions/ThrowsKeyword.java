package Day45_Exceptions;

import java.io.IOException;

public class ThrowsKeyword {

    public static void main(String[] args) throws InterruptedException {

        try {
            Thread.sleep(3000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }


        Thread.sleep(3000);
       // System.out.println("Cybertek".charAt(500));

        System.out.println("Step 2");

    }
}
