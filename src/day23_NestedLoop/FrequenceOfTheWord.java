package day23_NestedLoop;

public class FrequenceOfTheWord {

    public static void main(String []args){
        String sentence = "Java is a programming language, I like to learn Java Java Java";
        // " is a programing language, I like to learn Java"
        // " is a programing language, I like to learn
        String word = "Java";

        int count = 0;

        while ((sentence.contains(word))){
            sentence = sentence.replaceFirst(word,""); //we need to remove one at the time for counting frequency
            count++;

        }
        System.out.println(count);
        System.out.println(sentence);
    }
    /*
    write a program that can return the frequncy of the a word from the sentence
        Ex:
            sentence = "Java is a programming language, I like to learn Java";
            word = "Java";
            output:
                2

     */
}
