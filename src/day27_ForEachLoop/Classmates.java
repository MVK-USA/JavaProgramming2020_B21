package day27_ForEachLoop;

public class Classmates {

    public static void main(String[] args) {

        String[] names = {"Erjon", "Katrin","Aamir", "Lola","Muhtar"};

        for(String eachName: names){
            System.out.println(eachName.substring(0, 3));
        }
    }
}
