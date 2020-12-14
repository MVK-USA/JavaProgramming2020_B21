package HomeWork.Quizz_Static_Instance;

public class q1 {
    static int a;
    int b;

    public static void main(String[] args) {
        q1 o1 = new q1();
        o1.b =10;
        o1.a =20;
        q1 o2 = new q1();
        o2.b=30;
        o2.a=40;

        System.out.println(o1.a +" "+o1.b);
        System.out.println(o2.a + " "+ o2.b);
    }
}

