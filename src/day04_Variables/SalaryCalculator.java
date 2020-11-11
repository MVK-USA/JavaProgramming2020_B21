package day04_Variables;

public class SalaryCalculator {

    public static void main(String[] args) {
        int salary = 150000; //whole number
        double taxRate = 0.28; //decimal
        double totalTax = salary * taxRate;
        double salaryAfterTax = salary - totalTax;

        System.out.println("Total tax is: ");
        System.out.println(totalTax);
        System.out.println("Salary after taxes: ");
        System.out.println(salaryAfterTax);


        /*
        Task04: SalaryCalculator
    write a program that can calculate the salary after tax based on the salary and tax rate
            Ex: if salary = 150000
                   tax = 0.28
                   salary after tax = 72000

                   totalTax = salary * tax;
                   salary after tax = salary - totalTax
         */
    }
}
