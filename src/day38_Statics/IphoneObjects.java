package day38_Statics;

public class IphoneObjects {

    public static void main(String[] args) {

        iPhone phone1 = new iPhone();

        iPhone phone2 = new iPhone();

        iPhone phone3 = new iPhone();

        iPhone phone4 = new iPhone();

        //  phone1.OS = "Android";

        System.out.println(phone1.OS);
        System.out.println(phone2.OS);
        System.out.println(phone3.OS);
        System.out.println(phone4.OS);

        System.out.println("============================");
        iPhone.getInfo();



    }

}

