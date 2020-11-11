package day21_WhileLoop;

public class SubStringMethodPractice {

    public static void main(String[] args) {
        String email = "Alexander_Daniel@Apple.com";
        int indexOf_ = email.indexOf("_");
        int insexOfAt = email.lastIndexOf("@");

        String lastName = email.substring(0,indexOf_);
        String firstName = email.substring(indexOf_+1, insexOfAt);
        
        String domain = email.substring(insexOfAt+1,email.lastIndexOf("."));
        
        System.out.println("Last Name = "+lastName);
        System.out.println("firstName = " + firstName);
        System.out.println("domain = " + domain);
    }
}
/*
    lastName_firstName@companyName.com
 */