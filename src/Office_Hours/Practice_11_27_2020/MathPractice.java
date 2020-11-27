package Office_Hours.Practice_11_27_2020;

public class MathPractice {

    public static void main(String[] args) {
        double n1 = Math.pow(2, 3);  // power
        // 2*2*2 = 8

        System.out.println(n1);

        double n2 = Math.pow(10, 2);  // 10*10 = 100;
        System.out.println(n2);

        int n3 = Math.max(100, 200);
        System.out.println("max number: " + n3);

        int n4 = Math.min(100, 200);
        System.out.println("min number: " + n4);

        int[] numbers = {1,2,3,4,5,6,7,8,9};
        int max = numbers[0];
        int min = numbers[0];

        for ( int each: numbers){
            max = Math.max(each, max);
            min = Math.min(each, min);
        }

        System.out.println("min = " + min);
        System.out.println("max = " + max);

        System.out.println(Math.PI);
        System.out.println(Math.E);

        double n5 = Math.sqrt(100.0);
        System.out.println(n5);

        System.out.println(calculateAreaOfCircle(3));
    }
    public static double calculateAreaOfCircle(double r){
        return Math.PI*Math.pow(r,2);
    }
}
