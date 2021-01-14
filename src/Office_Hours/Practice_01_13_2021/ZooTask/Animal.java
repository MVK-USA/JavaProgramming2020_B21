package Office_Hours.Practice_01_13_2021.ZooTask;

public abstract class Animal {  //Only for things that are common for all sub classe
    public String name, size;
    public final String breed;
    public final char gender;
    public int age;

    public static boolean isAnimal = true;

    public static int numberOfEyes = 2;

    static{
        isAnimal = true;
    }

    public Animal(String name, String breed, String size, char gender, int age){
        this.name = name;
        this.breed = breed;
        this.size = size;
        this.gender = gender;
        this.age = age;

    }


    protected abstract void speak();
    protected abstract void play();

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
