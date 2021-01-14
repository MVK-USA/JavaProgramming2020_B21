package day48_Abstraction;

public interface InterfaceRules {

    int a = 100; // static by default

    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(InterfaceRules.a);

        // a =100; by default it's final
    }
    void method2();

    public default void m(){

    }
}
/*
Interface: cannot have objects
What we cna have:
    variables: public static and final by default
    methods: abstract method
            static methods
            default method
what we cannot have:
    constructor
    instance methods
    instance variables
    blocks
 */

