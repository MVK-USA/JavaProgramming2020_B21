package day29_Methods;

public class Calculator {

    public static void main(String[] args) {

        calculator( 10, '-', 50);
    }


    public static void calculator(double n1, char operator, double n2) {

        boolean isValid = operator == '+' || operator == '-' || operator == '*'
                || operator == '/' || operator == '%';
        if (isValid) {
            switch (operator) {
                case '+':
                    System.out.println("Addition: " + (n1 + n2));
                    break;
                case '-':
                    System.out.println("Subtraction: " + (n1 - n2));
                    break;
                case '*':
                    System.out.println("Multiplication: " + (n1 * n2));
                    break;
                case '/':
                    System.out.println("Division: " + (n1 / n2));
                    break;
                default:
                    System.out.println("Remainder: "+ (n1%n2));
            }
        } else {
            System.out.println("Invalid Operator");
        }
    }

}

