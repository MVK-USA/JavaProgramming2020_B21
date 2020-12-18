package day43_Inharitance.CarTask;

public class Toyota extends Car{

    public Toyota(String model, String color, int year, int miles, double price){
        setInfo("Toyota", model, color, "Japan", year, miles, price);
    }
    public static boolean isAfordable, isImmortal;



static{
        isAfordable = true;
        isImmortal = true;
}

}
