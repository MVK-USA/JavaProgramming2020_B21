package HomeWork.Quizz_Static_Instance;

public class q4 {
    static String stN = "Mike";

    static {
        stN = "Jordan";
    }

    public static void main(String[] args) {
        stN ="Jean";
        System.out.println(stN);
    }
}
