package UnitTest4;

import java.util.Arrays;

public class q5 {

    int pages;
    static String author;

    static{
        author = "S K";
    }
    public void set(int pages){
        this.pages = pages;
    }

    public static void main(String[] args) {
        q5 b1 = new q5();
        b1.set(500);
        b1.author = "CHris Po";
        q5 b2 = new q5();

        System.out.println(b1.author.equals(b2.author)+" ");
        System.out.println(b1.pages == b2.pages);
    }


}