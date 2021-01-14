package day48_Abstraction.AnimalTask;

public class Dolphin extends Animal implements Swimable, Playable{
    public Dolphin(String name, String breed, char gender, int age) {
        super(name, breed, gender, age);
    }

    @Override
    public void sleep() {
        System.out.println("Dolphin sleeps 8 hours");
    }

    @Override
    public void swim() {
        System.out.println("Dolphin can swim 10 hours");
    }

    @Override
    public void play() {
        System.out.println("Dolphin plays with human");

    }
}
