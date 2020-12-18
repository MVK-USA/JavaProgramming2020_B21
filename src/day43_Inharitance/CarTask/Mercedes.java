package day43_Inharitance.CarTask;

public class Mercedes extends Car {

    public Mercedes(String model, String color, int year, int miles, double price){
        setInfo("Mercedes", model, color, "Germany", year, miles, price);
    }
    public static boolean isExpensive, isLuxury;


    static{
        isExpensive = true;
        isLuxury = true;

    }

}
