package day18_Strings;

public class StringPractice {
    public static void main(String[] args) {
        String s1 ="Cat";
        String s2 = "Cat";

        System.out.println(s1==s2);

        String s3 = new String ("Cat");
        System.out.println(s1 == s3); //false
        System.out.println(s2 == s3);

        String s4 = new String ("Cat");
        System.out.println(s3==s4); //false
        //equals()
        System.out.println(s1.equals(s3)); // true
        System.out.println(s2.equals(s3)); // true
        System.out.println(s3.equals(s4)); // true

        String s5 = new String("cat");
        System.out.println(s4.equals(s5)); //false,
        // equals method is case sensitive
        System.out.println(s4.equalsIgnoreCase(s5));
        //true, is not case sensitive

        System.out.println("==========IMMUTABLE========");


        String str = "cybertek";
           str = str.toUpperCase(); // "CYBERTEK"

        System.out.println(str);

        str = str.toLowerCase();

        System.out.println(str);

        System.out.println("==charAT=====LENGTH===");
        String name = "CybertekSchool";

        int n1 = name.length(); // 14;
                                // last index: 13;
        System.out.println(n1);

        String name2 = "Muhtar";

        int n2 = name2.length(); //6; last index:5;

        int lastIndex = name2.length()-1;
        System.out.println(n2);
        System.out.println(lastIndex);

        System.out.println("====print first and last character=====");
        String a = "Cybertek School";

        char firstChar = a.charAt(0);
        char lastChar = a.charAt (a.length()-1);
                                 // last index num of a
        System.out.println("First character: "+firstChar);
        System.out.println("Last character: "+lastChar);

        System.out.println("======second character========");

        String b = "Today is Monday";

        char secondChar = b.charAt(1);
        char secondLastChar = b.charAt(b.length()-2);

        System.out.println("secondChar = " + secondChar);
        System.out.println("secondLastChar = " + secondLastChar);






    }
}
