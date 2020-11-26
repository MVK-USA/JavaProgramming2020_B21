package Office_Hours.Practice_11_25_2020;

public class MethodPractice {

    public static void main(String[] args) {
        divisibleBy3Between1To100();
    }

    public static void divisibleBy3Between1To100() {
        for(int i=1; i<=100; i++){
            if(i%3 !=0){   // if the number is not divisible by 3
                continue; // then skip
            }
            System.out.print(i + " ");
        }
        System.out.println();




    }
}
