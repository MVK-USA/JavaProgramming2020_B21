package Day45_Exceptions;

public class FinallyBlock {

    public static void main(String[] args) {

        try{
            System.out.println("Hello World");
        }catch(IndexOutOfBoundsException e){
            System.out.println("Catch Block");
           // System.exit(0);
        }finally{
            System.out.println("Finally closed");
        }

        System.out.println("Test Completed");
    }
}
