package ArrayPractice;

import java.lang.module.FindException;
import java.util.Scanner;

public class ClassMate {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("please enter 10 student names");

        String classMates [] = new String[10];
        for (int i = 0; i < 10; i++) {
            classMates[i] = input.nextLine();
        }
            for (String each : classMates) {
                System.out.println(each.charAt(0) + "" + each.charAt(each.indexOf(" ") + 1));
            }

        System.out.println("----------------------------");

            //reverse each students names and print them in separate lines

        for (String each : classMates) {
            
        }
    }
}
/*
create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmates in separate lines

 */