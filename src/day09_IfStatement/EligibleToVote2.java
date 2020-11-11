package day09_IfStatement;

public class EligibleToVote2 {

    public static void main(String[] args) {
        String name = "Daniel";
        boolean isUSACitizen = true;
        int age = 38;
        boolean hasCriminalBackground = false;

        boolean isEligibleToVote = isUSACitizen == true && age >=18 && hasCriminalBackground == false;


        //                         true == true && 29>=18
        //                           true  &&  true
        //                              true

        System.out.println(name+ " is eligible to vote: "+isEligibleToVote);

        String name1 = "Jimmy";
        boolean isUSACitizen1 = false;
        int age1 = 25;
        boolean hasCriminalBackground1 = true;
        boolean isEligibleToVote1 = isUSACitizen1 == true && age1 >=18 && hasCriminalBackground1 == false;

        System.out.println(name1+ " is eligible to vote: "+isEligibleToVote1);

        String name2 = "John";
        String c1 = "Canada";
        String c2 = "USA";

        boolean eligible = c1 == "USA" || c2 == "USA";
        //                 "Canada" == "USA" || "USA" == "USA"
        //                    false
        //                    TRUE
        System.out.println(name2+" is eligible to vote: "+eligible);





    }
}
