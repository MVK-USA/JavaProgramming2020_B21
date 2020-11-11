package day11_MultiBranchIf;

public class Grade {
    public static void main(String[] args) {
        int score = 50; // 0-100;

        String grade = " ";  // we can also put char grade = ' ';

        if (score>=90) {
            grade = "A";
        }else if(score>=80){
            grade ="B";
        }else if(score>=70){
            grade="C";
        }else if(score>=60){
            grade ="D";
        }else{
            grade ="F";
        }
        System.out.println("Your grade is:"+grade);



    }
}
