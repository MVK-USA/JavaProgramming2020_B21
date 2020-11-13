package day29_Methods;

public class MethodsWithParameters {

    public static void main(String[] args) {
        int age = 35;
        eligibleToBuyAlcohol(30);

        calculateAge(1976, 2020);

    }

    public static void eligibleToBuyAlcohol(int age) {
        if (age >= 21) {
            System.out.println("Eligible to buy alcohol");
        } else {
            System.out.println("Not eligible to buy alcohol");
        }
    }

    public static void calculateAge(int birthYear, int currentYear) {
        if (birthYear < currentYear) {
            System.out.println("Your age is: " + (currentYear - birthYear) + " years old");
        }else{
            System.out.println("Invalid entry");
        }
    }
}

