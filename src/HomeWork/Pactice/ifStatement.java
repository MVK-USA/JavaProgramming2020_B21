package HomeWork.Pactice;

public class ifStatement {

    public static void main(String[] args) {


        String name = "Michael";
        String citizenship = "USA";
        int age = 15;
        boolean isEligible = age >= 21;

        if (isEligible) {
            System.out.println(name + " is eligible to vote");

        }
        if (!isEligible) {
            System.out.println(name + " is NOT eligible to vote");
        }

        System.out.println("==================================================");

        String name1 = "Dan";
        int age1 = 25;
        boolean citizen = true;

        if (citizen && age1 >= 18) {
            System.out.println(name1+" is Eligible to vote");
        }
        if (!citizen && age1 >= 18) {
            System.err.println(name1+" is NOT eligible to vote");
        }
        System.out.println("==============================");

        int num = 215;
        boolean even = num % 2 == 0;
        boolean odd = !even;

        if(even){
            System.out.println(num + " is even number");
        }
        if(odd){
            System.out.println(num+ " is odd number");
        }


    }
}

