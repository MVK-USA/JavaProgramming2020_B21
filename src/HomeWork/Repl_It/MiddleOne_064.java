package HomeWork.Repl_It;
import java.util.Scanner;

public class MiddleOne_064 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();


    }
}
/*
You have a word, do the following:

1. When word has odd number of characters and:
            - 3 or more characters, print middle letter
      oak ==> a
      javav ==> v
             - Single character, print that character 3 times
      # ==> ###
      q ==> qqq

2. When word has even number of characters and:
           - 4 or more characters, print middle 2
     java ==> av
     apples ==> pl
     #$%^&* ==> %^
           - 2 characters, print those 2 characters twice
      @@ ==>@@@@
      $$ ==>$$$$
      hi ==> hihi

      import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String word = scan.next();
    //YOUR CODE HERE

  }
}

 */