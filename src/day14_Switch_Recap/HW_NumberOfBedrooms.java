package day14_Switch_Recap;

public class HW_NumberOfBedrooms {

    public static void main(String[] args) {
        int numberOfBedrooms = 1;
        int startingPrice = 0;

        if(numberOfBedrooms==1) {
            System.out.println("One Bedroom Selected");
            startingPrice = 1100;
        }else if(numberOfBedrooms==2) {
            System.out.println("Two Bedroom Selected");
            startingPrice = 1850;
        }else if(numberOfBedrooms==3) {
            System.out.println("Three Bedroom Selected");
            startingPrice =2550;
        }else{
            System.out.println("No such Bedrooms available");
        }
        System.out.println("Starting Price: "+startingPrice);


    }
}
