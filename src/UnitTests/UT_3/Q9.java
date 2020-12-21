package UnitTests.UT_3;

public class Q9 {
    public static void main(String[] args) {
        double n = add(3.4);

        n+= add("dual");
        n+= add(Integer.parseInt("100"));
        n+= add(11341L);
        n+= add(Float.parseFloat("50.8"));
        System.out.println(n);
    }
    public static int add (int a){
        return 5;
    }
    public static double add(double b){
        return 2.5;
    }
    public static long add(String s){
        return 10;
    }
}
