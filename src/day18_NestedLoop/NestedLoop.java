package day18_NestedLoop;

import java.util.Locale;
import java.util.Scanner;

public class NestedLoop {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true){

            System.out.println("first number");
            int num1 = scan.nextInt();
            System.out.println("second number");
            int num2 = scan.nextInt();

            System.out.println("addition: " + (num1 + num2));

            System.out.println("continue?");
            String a = scan.next().toLowerCase();

            while (!(a.equals("yes") || a.equals("no"))){
                System.out.println("invalid");
                a = scan.next().toLowerCase();
            }
            if(a.equals("no")){
                break;
            }


        }
    }
}
