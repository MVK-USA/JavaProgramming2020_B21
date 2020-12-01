package day35_CustomClass;

public class Car {

    public String brand; //instance variable
    public String model;
    public String color;
    public int year;
    public void setInfo(String carBrand, String carModel, String carColor, int carYear){ // Instance methods
        brand = carBrand;
        model = carModel;
        color = carColor;
        year = carYear;
    }

    public void getInfo(){
        System.out.println(year+" "+brand+" "+model+" "+color);
    }

}
/*
Car class:
		Attributes: instance variables
			brand, model, color, price, year....
		actions: instance methods
			driver(), stop()....
 */