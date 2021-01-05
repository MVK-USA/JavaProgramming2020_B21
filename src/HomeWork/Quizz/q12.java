package HomeWork.Quizz;
import java.util.Scanner;
public class q12 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n1 =input.nextInt();
        int n2 =input.nextInt();
        int iter=input.nextInt();

        int total =0;

        for(int j=0; j<iter; j++){

            if(j%3 ==0) continue;
            total+= n1+n2;
        }
        System.out.println(total);

    }
}
