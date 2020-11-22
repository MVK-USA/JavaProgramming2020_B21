package HomeWork;

public class Replit115ArraysFindSum {

    public static void main(String[] args) {

        int[] num = {1, 7, 9, 3, 5};
        int sum = 0;


        for(int i = 0; i<num.length; i++){
            sum += num[i];
        }
        System.out.println("sum = " + sum);
    }
}
