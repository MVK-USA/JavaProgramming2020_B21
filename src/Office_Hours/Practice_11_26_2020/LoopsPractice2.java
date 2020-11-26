package Office_Hours.Practice_11_26_2020;

import java.util.Scanner;

public class LoopsPractice2 {

    public static void main(String[] args) {
        /*
        salary calculator:
        hourlyRate
        weeklyHour
        tax rates: 30%

        continue?
         */
        Scanner scan = new Scanner(System.in);
        double hourluRate =0;
        int weeklyHour = 0;
        String answer = "";

        while(!answer.equals("no")) {
            System.out.println("Enter your hourlyRate");
            hourluRate = scan.nextDouble();
            System.out.println("How many hours do you work in a week?");
            weeklyHour = scan.nextInt();
            double salary = weeklyHour * hourluRate * 52;
            System.out.println("your salary: " + salary);
            double tax = salary * 0.3;
            System.out.println("Your tax: "+tax);
            double salaryAfterTax = salary - tax;
            System.out.println("Your salary after tax: " + salaryAfterTax);

            System.out.println("Would you like to continue?");
            answer = scan.next();
        }

    }
}
