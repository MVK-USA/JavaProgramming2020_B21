package day41_Encapsulation;

public class Login {

    public static void main(String[] args) {

        Credentials obj = new Credentials();

        System.out.println(obj.userName);
        obj.userName = "ABC";

        System.out.println(obj.userName);
    }
}
