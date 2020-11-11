package day11_MultiBranchIf;

public class GradeReport{

    public static void main(String[] args) {
        int score = 90; //0-100

        if(score <60){                            //String result = " "
            System.out.println("Failed"); // result = "Failed";
        }else if(score >=60 && score <90){
            System.out.println("Pass");
        }else{
            System.out.println("Passed with Distinction");
        }

    }
}
