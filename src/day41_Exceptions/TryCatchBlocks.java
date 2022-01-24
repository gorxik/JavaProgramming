package day41_Exceptions;

public class TryCatchBlocks {

    public static void main(String[] args) {

        System.out.println("Test started");


        try{
            System.out.println(9 / 0 );
            System.out.println("try block");

        }catch(ArithmeticException e){

            System.out.println("catch block");
            System.out.println("ArithmeticException was occurred");
        }


        System.out.println("Test ended");
    }
}
