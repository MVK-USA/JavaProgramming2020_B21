package day48_Abstraction.AnimalTask;

public class Lion extends Animal implements Predator{
    public Lion(String name, String breed, char gender, int age) {
        super(name, breed, gender, age);
    }

    @Override
    public void sleep() {
        System.out.println("Lion sleeps 10 hours");
    }
    @Override
    public void hunt(){
        System.out.println("Lion eats deer");

    }


}
