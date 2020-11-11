package day22_JavaRecap;

public class StringPractice3 {

    public static void main(String[] args) {
        
        String sentence = "Capital of Canada is Washington";
        sentence = sentence.replace("Canada", "United States");
        System.out.println("sentence = " + sentence);


        System.out.println("=================================================");

        String s = "Cybertek School is in Boston, Cybertek Campus is in McLean";
        s = s.replaceFirst("Cybertek", "MIT");

        System.out.println(s);

        System.out.println("  ====        ======================" );

        String r = "cava is cool programming language, I like to learn cava at cybertek school";
        r = r.replace("cav","jav");
        System.out.println(r);

        String p = "I like Java and Java Java Java Java";
        p = p.replace("Java", "").replace("like", "like java");
// p = p.replaceFirst("Java", "C#");
        System.out.println(p);

        System.out.println(" =====================   ");
        // contains, isEmpty, startsWith, endsWith

        String s2 = "I like to learn Java";
        System.out.println("Contains c#: " + s2.toLowerCase().contains("java")); // true
        System.out.println(s2.equals("java"));  // false
        System.out.println(s2.equalsIgnoreCase("java")); // false

        System.out.println("==================================================");
        String s3 = "Cybertek School is the best";

        System.out.println(s3.toLowerCase().contains("cybertek")); // when ToLowerCase - true

        System.out.println(s3.equals("cybertek")); // FALSE
        System.out.println(s3.equalsIgnoreCase("cybertek")); //false

        System.out.println("Java".isEmpty()); // false
        System.out.println("".isEmpty()); // true

        System.out.println("==================================");
        // startsWith, ensdWith

        String URL = "https://www.amazon.com";  //.com, .gov. .edu

        boolean isValid = URL.startsWith("http") && (URL.endsWith(".com")) || URL.endsWith(".edu")
                || URL.endsWith(".gov");
        if(isValid){
            System.out.println("URL is valid");
        }else{
            System.out.println("Invalid");
        }
        System.out.println("==========================================");
        /*
        valid emails: gmail, hotmail, yahoo, outlook
         */
String email = "Java_Masters@java.com";
boolean validEmail = email.endsWith("gmail.com") || email.endsWith("hotmail.com")
|| email.endsWith("yahoo.com") || email.endsWith("outlook.com");

if(validEmail){
    System.out.println("valid email");
}else{
    System.out.println("Invalid");
}

    }
}
