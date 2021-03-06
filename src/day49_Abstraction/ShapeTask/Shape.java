package day49_Abstraction.ShapeTask;

public abstract class Shape {

    public String name;

    public Shape(String name){
        if(name.isEmpty()){
            throw new RuntimeException("Name can't be empty");
        }
        this.name = name;
    }
    public abstract double area();
    public abstract double perimeter();


    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                "area='" + area() + '\'' +
                "perimeter='" + perimeter() + '\'' +
                '}';
    }

}
