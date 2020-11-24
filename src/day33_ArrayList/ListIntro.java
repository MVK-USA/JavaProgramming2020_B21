package day33_ArrayList;

import java.util.ArrayList;
public class ListIntro {

    public static void main(String[] args) {

        ArrayList <Integer> scores = new ArrayList<Integer>(); //size:1

        scores.add(100);  // autoboxing 0
        scores.add(90); //autoboxing 1
        scores.add(80); // autoboxing 2

        System.out.println(scores);

        System.out.println("=================================");

        ArrayList<String> groceryList = new ArrayList<>(); // [Egg, Water, Milk, Bread]
        groceryList.add("Egg");
        groceryList.add("Water");
        groceryList.add("Milk");
        groceryList.add("Bread");

        groceryList.add(0, "Toilet Paper");
        groceryList.add(1, "Sanitizer");
        groceryList.add(1, "masks");


        System.out.println(groceryList);







    }
}
