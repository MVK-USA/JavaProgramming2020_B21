package day09_IfStatement;

public class EligibleToVote {

    public static void main(String[] args) {
        String name = "John";
        String citizen = "USA";

        boolean EligibleToVote = citizen == "USA";
        System.out.println(name+ " is eligible to vote for Donald Trunp or Joe Biden?\n\t" +EligibleToVote);

        System.out.println("=========================================");


         /*
         write a program that can check if the person is eligible to vote for Donald Trump or Joe Biden
        Ex:
            name = "John"
            citizenShip = "USA"
            output:
                John is eligible to vote for Donald Trump or Joe Biden?
                    true
            name = "Jimmy"
            citizenShip = "Korea"
            output:
                Jimmy is eligible to vote for Donald Trump or Joe Biden?
                    false

          */
    }
}
