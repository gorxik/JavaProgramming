package day08_IfStatements;

public class SingleIfStatementIntro {
    public static void main(String[] args) {
        int number = 101;

        boolean evenNumber = number%2 ==0;
        boolean oddNumber = ! evenNumber; //not even number

        if (evenNumber){

            System.out.println("even number");
        }

        if (oddNumber) {

            System.out.println("odd number");
        }

        int n = 200;

       if(n>0){

           System.out.println("it is positive ^_^ ");

       }

       if (n<0){

           System.out.println(" it is negative, like yourself " );

       }

       if (n==0){

           System.out.println("its only zorrooooo");
       }
        }
    }

