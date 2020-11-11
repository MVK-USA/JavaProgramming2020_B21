package day03_Variables;

public class CalculateSquare {

    public static void main(String[] args) {
 /*
 A = side * side
 P = side * 4
  */
        int side = 10;  // to make it reusable
        int area = side * side;  // another info that we gained by using side
        int perimeter = side * 4;

        System.out.print("Area of Square is: ");
        System.out.print(area);
        System.out.println();
        System.out.print("Perimeter of Square is: ");
        System.out.print(perimeter);
    }
}
