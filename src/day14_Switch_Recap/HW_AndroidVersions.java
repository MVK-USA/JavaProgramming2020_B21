package day14_Switch_Recap;

public class HW_AndroidVersions {

    public static void main(String[] args){
        double version = 1.5;
        String name = "";

        if(version==1.5){
            name = "Cupcake";
        }else if(version==1.8){
            name="Donut";
        }else if(version==2.1){
            name="Eclair";
        }else if(version==2.2){
            name ="Froyo";
        }else if(version==2.3){
            name = "Gingerbread";
        }else if(version==3.1){
            name ="Honeycomb";
        }else if(version==4.0){
            name = "Ice Cream Sandwich";
        }else if(version>=4.1 && version<=4.31){
            name = "Jelly Bean";
        }else if(version>=4.4 && version<=4.44){
            name = "KitKat";
        }else if(version>=5.0 && version<=5.11){
            name="Lolipop";
        }else if(version>=8.0 && version<=8.1){
            name="Oreo";
        }else if(version==9.0){
            name = "Pie";
        }else{
            name = "Sorry, I don't know this version!";
        }
        System.out.println(name);

        System.out.println("============================================");

        if(version==1.5) System.out.println("Cupcake");
        else if(version==1.8) System.out.println("Donut");
        else if(version==2.1)System.out.println("Eclair");
        else if(version==2.2) System.out.println("Froyo");
        else if(version==2.3)System.out.println("Gingerbread");
        else if(version==3.1)System.out.println("Honeycomb");
        else if(version==4.0)System.out.println("Ice Cream Sandwich");
        else if(version>=4.1 && version<=4.31) System.out.println("Jelly Bean");
        else if(version>=4.4 && version<=4.44)System.out.println("KitKat");
        else if(version>=5.0 && version<=5.11)System.out.println("Lolipop");
        else if(version>=8.0 && version<=8.1)System.out.println("Oreo");
        else if(version==9.0)System.out.println("Pie");
        else System.out.println("Sorry, I don't know this version!");


    }

}
