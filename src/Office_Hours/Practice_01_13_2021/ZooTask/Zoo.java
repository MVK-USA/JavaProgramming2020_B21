package Office_Hours.Practice_01_13_2021.ZooTask;

public class Zoo {

    public static void main(String[] args) {
       // Animal animal = new Animal("Animal", "Breed", "Size", 'M',25);
        Dog dog = new Dog("Charlie", "German Shepard", "Large",'M', 12);
        Cat cat = new Cat("maniboo", "Bengal", "small", 'F', 125);
        Shark shark = new Shark("White", "Hammerhead","large", 'F', 25);

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(shark);

        dog.speak();
        cat.speak();
        shark.speak();

        dog.play();
        cat.play();
        shark.play();






    }
}
