package day46_javaRecap.CarTask;

public final class Lexus extends Car {

    public Lexus(String model, String color, int year, double price) {
        super("Lexus", model, color, year, price);
    }

    public void start() {
        System.out.println("Starting "+brand+" "+model+" by inserting key");
    }

}
