package day48_Abstraction.AnimalTask;

public class Shark extends Animal implements Predator, Swimable{
    public Shark(String name, String breed, char gender, int age) {
        super(name, breed, gender, age);
    }

    @Override
    public void sleep() {
        System.out.println("Sharks sleep 0 hours");
    }

    @Override
    public void hunt() {
        System.out.println("Sharks hunting for the fish");
    }

    @Override
    public void swim() {
        System.out.println("Sharks can swim 20 hours");

    }
}
