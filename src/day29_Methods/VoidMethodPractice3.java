package day29_Methods;

public class VoidMethodPractice3 {

    public static void main(String[] args) {

        eligibleToVote("USA", 45, true);
    }

    public static void eligibleToVote (String citizenship, int age, boolean isAlive){
        if(citizenship.equalsIgnoreCase("USA")){
            if(isAlive){
                if(age>=18){
                    System.out.println("You are eligible to vote");
                }else{
                    System.err.println("You must be at least 18 years old");
                }
            }else {
                System.err.println("You must be come back to life in order to vote");
            }
        }else{
            System.err.println("You must be citizen of USA");
        }
    }


}

