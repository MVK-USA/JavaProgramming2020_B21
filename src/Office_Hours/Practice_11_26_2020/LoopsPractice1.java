package Office_Hours.Practice_11_26_2020;

public class LoopsPractice1 {

    public static void main(String[] args) {

        /*
System.out.println(1);
System.out.println(2);
System.out.println(3);
System.out.println(4);
System.out.println(5);
         */

        for (int i = 1; i <= 50; i++) {
            System.out.print(i);
        }
        System.out.println();

        // even numbers:
        System.out.println("Even Numbers: ");
        for (int i = 2; i <= 50; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        //odd numbers:

        System.out.println("Odd Numbers: ");
        for (int i = 1; i <= 49; i += 2) {
            System.out.print(i + " ");
        }

        System.out.println("==================================");
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) { //i - odd number
                System.out.print(i + " ");
            }

        }
        System.out.println("=========================");
        for (int i = 1; i <= 50; i++) {
            if (i % 2 != 0) {   //if i value is odd
                continue;  // skip
            }
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) { //if i skip odd number
                continue; // skip it
            }
            System.out.print(i + " ");  // print even numbers
            if (i == 29) {
                break; // exits the loop
            }

        }
    }
}
