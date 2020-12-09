package Office_Hours.Practice_12_09_2020;

public class PizzaOrder {

    public static void main(String[] args) {
         Pizza pizza1 = new Pizza();

         pizza1.customizeOrder("Small", 2, 2, 20);

        System.out.println(pizza1);

        System.out.println("=======================================");

        Pizza[] cybertekPizza = new Pizza[175];

        for(int i=0; i <=cybertekPizza.length-1; i++) {
            Pizza pizza = new Pizza();
            pizza.customizeOrder("Medium", 2, 3, 18);

            cybertekPizza[i] = pizza;

        }
        double total = 0;
for(Pizza each:cybertekPizza){
    total += each.totalPrice;


}
        System.out.println("Total price: "+total);

        System.out.println("==============================================");
    }
}
