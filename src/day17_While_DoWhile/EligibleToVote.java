package day17_While_DoWhile;

import java.util.Locale;
import java.util.Scanner;

public class EligibleToVote {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter age");
        int age = scan.nextInt();

        while (!(age >= 1 && age <= 120)){
            System.err.println("invalid");
            System.out.println("Enter age");
            age = scan.nextInt();
        }
        System.out.println("US citizen?");
        String answer = scan.next().toLowerCase();

        while(!(answer.equals("yes") || answer.equals("no"))){
            System.err.println("invalid");
            System.out.println("US citizen?");
            answer = scan.next().toLowerCase();
        }

        if(age >= 18 && answer.equals(("yes"))){
            System.out.println("eligible!");
        }else{
            System.out.println("go home you drunk");
        }

    }
}
