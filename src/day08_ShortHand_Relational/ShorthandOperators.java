package day08_ShortHand_Relational;

public class ShorthandOperators {
    public static void main(String[] args) {
        int a = 10;

        System.out.println(a);

        a = 30;
        System.out.println(a);

        String schoolName = "Cybertek";
        schoolName = "MIT";
        System.out.println(schoolName);

        int a1 = 10;
            a1 -= 7;
        System.out.println(a1);

        int x = 100;
            x -= 62; //x = x-62; ==> 38
        System.out.println(x);

        double salary = 100000; //0.28
               salary -= (salary * 0.28);
        System.out.println(salary);

        int x2 = 999999;
            x2 -= 25;
        System.out.println(x2);

        double balance = 2000;
               balance -= 450;
        System.out.println(balance);

          //depositing
        balance += 5000;
        System.out.println(balance);

        int y2 = 400;
        y2 += 1000 * 0.1;
        //y2 += 1000;
        //y2 = 1400;
        System.out.println(y2);

        String name = "Cybertek";
                name += " School";
        System.out.println(name);

        int w = 10;
           w*= 10;
        System.out.println(w);

        double totalTax = 100000;
        totalTax *= 0.28;
        System.out.println(totalTax);

        int bonus = 5000;
        bonus *= 2; //2+1...;
        System.out.println(bonus);

        int slice =10;
        slice /= 5;
        System.out.println(slice);

        int house = 500000;
        int month = 240;

        double monthlyPayment = house;
        monthlyPayment /= month;
        System.out.println(monthlyPayment);

        int q = 2000;
        q %= 2; //a=2000 % 2 = 0;
        System.out.println(q);






    }




}
