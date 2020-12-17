package day42_Inharitance.DeviceTask;

public class Phone extends Device {

    public static boolean canCall, canSendMessages, hasCamera;

    static {
        canCall = true;
        canSendMessages = true;
        hasCamera = true;

    }
    public Phone(String brand, String model, double price){
        setInfo("Phone", brand, model, price);
    }
    public void call(long number){
        System.out.println(brand+" "+model+" is calling "+number);
    }
    public void text(long number){
        System.out.println(brand+" "+model+" is texting to "+number);
    }
}
