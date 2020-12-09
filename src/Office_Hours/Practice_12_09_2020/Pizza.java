package Office_Hours.Practice_12_09_2020;

public class Pizza {
    public String size;
    public int cheeseTopping, pepperoniTopping;
    public double priceOfPizza, tips, totalPrice;

    public void customizeOrder(String size, int cheeseTopping, int pepperoniTopping) {
        this.size = size;
        this.cheeseTopping = cheeseTopping;
        this.pepperoniTopping = pepperoniTopping;
    }

    public double calcCost() {
        double startingPrice = (size.equalsIgnoreCase("small")) ? 10
                : size.equalsIgnoreCase("medium") ? 12 : 14;

        double cheese = 1 * cheeseTopping;
        double pepperoni = 1.5 * pepperoniTopping;
        return startingPrice + cheese + pepperoni;

    }

}
