package Office_Hours.Practice_01_13_2021.ZooTask;

public class Dog extends Animal{

    public Dog(String name, String breed, String size, char gender, int age) {
        super(name, breed, size, gender, age);
    }
    public void speak(){
        System.out.println("Woof Woof");
    }
    @Override
    protected void play() {
        System.out.println("plays with ball");
    }
    @Override
    public String toString(){
        return "Dog" + super.toString();
    }
}
