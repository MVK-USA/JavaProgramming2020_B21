package day39_Constructor;

public class StaticBlocks2 {

    static{
        System.out.println("Static Block");
    }
    static{
        System.out.println("Static Block 2");
    }
    static{
        System.out.println("Static block 3");
    }

    public static void main(String[] args) {
        System.out.println("Main method");
    }
}
