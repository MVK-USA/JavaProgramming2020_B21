package day33_ArrayList;

public class quizz2 {

    public static void main(String[] args) {

        int wd =0;
        String[] da={"sun","m","w","sa"};
        for(int i=0; i<da.length; i++){
            switch (da[i]){
                case "sa":
                case"sun":
                    wd-=1;
                    break;
                case "m":
                    wd++;
                case "w":
                    wd +=2;
            }
        }
        System.out.println(wd);
    }
}
/*
What's the result of the given code fragment?
 */