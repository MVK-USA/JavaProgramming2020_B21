package day49_Abstraction.ShapeTask;

public class Circle extends Shape{
    public double r;
    public final static double PI = 3.14;
    public double d;

    public Circle(double r){
        super("Circle");
        if(r<=0){
            throw new RuntimeException("No such a circle with radius of "+r);
        }
        this.r = r;
        d = r*2;
    }

    @Override
    public double area() {
        return r * r* PI;
    }

    @Override
    public double perimeter() {
        return  d * PI;
    }
}
