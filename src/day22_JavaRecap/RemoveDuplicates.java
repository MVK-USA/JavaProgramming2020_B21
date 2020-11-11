package day22_JavaRecap;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String str = "AAAAAAAAAAAAAAABBBBBBBBBBBBCCCDDDDDDDDDDDDDEEEEEFFFFFFFFFFFFFFFFFFFFF"; // A,A, A, B,B
        String result = "";   // "AB";

        for(int i = 0; i<=str.length()-1; i++){
            String eachCharacter = ""+str.charAt(i); // A,A,A,B,B
            if(result.contains(eachCharacter)){
                continue;
            }else{  // IF THE CHARACTER OF STR IS NOT CONTAINED IN THE RESULT YET, THEN WE CONCATE TH CHARACTER
              result += eachCharacter;
              /*
              if(!result.contains(eachCharacter)){
              continue;
              }else{
              result += eachCharacter
               */
            }
        }
        System.out.println("result = " + result);

    }
}
