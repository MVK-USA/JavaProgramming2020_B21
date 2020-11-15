package HomeWork;

public class Quizz4 {

    public static void main(String[] args) {
        String z ="today I will go to the beach";
        boolean b = z.contains("i");
        boolean c = z.substring(12).startsWith("go");

        String result = b&&c?"go":"don't go";
        System.out.println(result);
    }
}
