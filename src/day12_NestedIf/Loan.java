package day12_NestedIf;

public class Loan {

    public static void main(String[] args) {
        double minimumSalary = 50000;
        double jobHistory = 1;
        int creditScore = 750;

        if (minimumSalary >= 30000) {
            if (jobHistory >= 2) {
                if (creditScore >= 680) {

                    System.out.println("You are qualified for loan");
                } else {
                    System.out.println("You must be on the job for 2 years");
                }

            } else {
                System.out.println("You must have minimum of 30k salary first");
            }


        }
    }
}

