package HomeWork;

public class q11 {
    public static void main(String[] args) {

        String s ="today it will be 100 degrees";
        int n = 0;

        while(n++<s.length()){

            if(n==8){
                continue;
            }else if (n==9){
                break;
            }
            System.out.println(s.charAt(++n));
        }
    }
}
