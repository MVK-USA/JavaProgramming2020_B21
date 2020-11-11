package day11_MultiBranchIf;

public class QuizQuestions {

    public static void main(String[] args) {

        int ivar = 100;
        double dvar = 200;
        float fvar = 300;

        ivar = (int)fvar; // explicit casting
        fvar = ivar; // implicit casting
        dvar = fvar; // implicit casting
        fvar = (float)dvar; // explicit casting. Has to be make manually
        dvar = ivar; // done automatically
        ivar = (int)dvar;





    }
}
