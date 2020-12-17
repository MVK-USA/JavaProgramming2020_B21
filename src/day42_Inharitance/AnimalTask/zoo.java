package day42_Inharitance.AnimalTask;

public class zoo {
    public static void main(String[] args) {

        Tiger tiger = new Tiger("Sher Khan", "bengal", 'M', 5, "Orange", "Large");
        System.out.println(tiger);
        tiger.eat("Chicken");
        tiger.hunt();


        Cat cat = new Cat("Kitty", "British fold", 'F', 1,"White", "Small" );
        System.out.println(cat);
        cat.eat("fish");
        cat.drink("milk");
        cat.sleep();
        cat.meow();

        Dog dog = new Dog("Dog", "mastif", 'M', 12, "black", "big" );
        System.out.println(dog);
        dog.eat("chicken");
        dog.drink("water");
        dog.bark();

        }

    }

