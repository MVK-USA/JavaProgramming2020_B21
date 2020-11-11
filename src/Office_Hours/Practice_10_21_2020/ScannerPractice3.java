package Office_Hours.Practice_10_21_2020;

import java.util.Scanner;

public class ScannerPractice3 {

    public static void main(String[] args) {

        /*
         1. ask gender (next() )
         2. ask age (nextInt() )
         3. ask fullName (nextLine() )
         4. ask zip code (nextInt() )
         5. ask country name (nextLine() )
         6. ask salary (nextDouble() )
         7. ask company name (nextLine() )
         8. ask address (nextLine() )
          */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your gender: ");
        String gender = scan.next();

        System.out.println("Enter your age: ");
        int age = scan.nextInt();

        scan.nextLine();

        System.out.println("Enter your full name: ");
        String fullName = scan.nextLine();

        System.out.println("Enter your zipcode: ");
        int zipcode = scan.nextInt();

        scan.nextLine();

        System.out.println("Enter your country name: ");
        String contryName = scan.nextLine();

        System.out.println("Enter your salary: ");
        double salary = scan.nextDouble();

        scan.nextLine();

        System.out.println("Enter your company name: ");
        String companyName = scan.nextLine();

        System.out.println("Enter the address: ");
        String address = scan.nextLine();

        


    }
}
