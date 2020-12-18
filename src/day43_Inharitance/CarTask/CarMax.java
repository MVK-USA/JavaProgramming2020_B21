package day43_Inharitance.CarTask;

public class CarMax {

    public static void main(String[] args) {
        Toyota toyota = new Toyota("Camry", "blue", 2019, 235000, 10000);

        BMW bmw = new BMW("X5", "red", 2018, 15000, 50000);

        Mercedes mercedes = new Mercedes("4Matis", "white", 2020, 10000, 75000);

        System.out.println(toyota);
        System.out.println(bmw);
        System.out.println(mercedes);

        System.out.println(Toyota.isAfordable);
        System.out.println(Toyota.isImmortal);

        System.out.println(BMW.isLuxury);
        System.out.println(BMW.isExpensive);
    }
}
