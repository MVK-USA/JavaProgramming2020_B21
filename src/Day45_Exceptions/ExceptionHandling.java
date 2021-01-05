package Day45_Exceptions;

public class ExceptionHandling {

    public static void main(String[] args){

        String str = "Cybertek";
        //String IndexOutOf
        try{
            System.out.println(str.substring(200, 300));
            System.out.println("Try Block");
        }catch(StringIndexOutOfBoundsException e){
            System.out.println("Catch Block");
           // System.out.println(e.Message());
          //  e.printStackTrace();
        }

        //Thread.sleep
        try{
            Thread.sleep(5000);
        }catch(InterruptedException e){

        }
        //

        try {
            System.out.println(100 / 0);
        }catch(RuntimeException e){
            System.out.println("Unchecked exception is occured: "+ e.getMessage());
        }



        System.out.println("Test Completed");
    }


}
