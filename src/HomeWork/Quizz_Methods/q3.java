package HomeWork.Quizz_Methods;

public class q3 {
    public static void main(String[] args) {
        dosum(10,20);
        dosum(10.0,20.0);
    }
    public static void dosum(double x, double y)
    {
        System.out.println("double s is"+(x+y));
    }
    public static void dosum(float x, float y){
        System.out.println("fl s"+(x+y));
    }
}
