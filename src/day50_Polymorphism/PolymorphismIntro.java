package day50_Polymorphism;

import day44_Inheritance.ChromeDriver;
import day44_Inheritance.ShapeTask.Circle;
import day44_Inheritance.ShapeTask.Rectangle;
import day44_Inheritance.ShapeTask.Shape;
import day44_Inheritance.WebDriverTask.CybertekDriver;
import day44_Inheritance.WebDriverTask.FireFoxDriver;
import day44_Inheritance.WebDriverTask.WebDriver;
import day50_Polymorphism.PhoneTask.IPhone;
import day50_Polymorphism.PhoneTask.Samsung;
import day50_Polymorphism.PhoneTask.Phone;

import java.util.ArrayList;
import java.util.List;

public class PolymorphismIntro {

    public static void main(String[] args) {

        //IPhone iphone1 = new IPhone("IPhone 12", "Small", "Black", 1100);
        //Samsung samsung1 = new Samsung("Galaxy S20", "Medium", "White", 1000);
        Phone phone1 = new Samsung("Galaxy S20", "Medium", "White", 1000);
        Phone phone2 = new IPhone("IPhone 12", "Small", "Black", 1100);

        ArrayList<Phone> phones = new ArrayList<>();
        phones.add(new IPhone("IPhone 11", "Small", "Black", 1100));
        phones.add(new Samsung("Galaxy 19", "Medium", "White", 1000));

        //List<Integer>list = new ArrayList<>();

        Shape shape;
        //shape = new Circle(3);
        shape = new Rectangle(3, 4);
        System.out.println(shape.calcArea());

        System.out.println("============================================================");
        String browserName = "firefox";

        WebDriver driver;

        switch(browserName){
            case "firefox":
                driver = new FireFoxDriver();
                break;

            case "chrome":
                driver = new ChromeDriver();
                break;

            case "cybertek":
                driver = new CybertekDriver();
                break;

            default:
                throw new RuntimeException("Invalid browser Name");
        }



    }
}
