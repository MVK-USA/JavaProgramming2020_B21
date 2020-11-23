package day32_LocalDate_WrapperClass;

public class ParseMethods {

    public static void main(String[] args) {
        String data1 = "123";

        System.out.println(data1+3); //1233

        int num1 = Integer.parseInt(data1); // none
        //  primitive = primitive

        Integer num2 = Integer.parseInt(data1); // autoboxing
        // wrapper class <= primitive

        System.out.println(num1);

        System.out.println(num1 +3);

        String s1 = "Hello";

        // int num3 = Integer.parseInt(s1);
        // System.out.println(num3);




    }
}
