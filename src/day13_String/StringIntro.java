package day13_String;

import java.util.Scanner;

public class StringIntro {

    public static void main(String[] args) {

        String name = "wooden spoon";
        String name2 = "wooden spoon";
        String name3 = "wooden spoon";
        String name4 = "wooden spoon";

        System.out.println(name == name2);
        System.out.println(name2 == name3);
        System.out.println(name3 == name4);

        System.out.println("------------------------");

        String str1 = new String("wooden spoon");
        String str2 = new String("wooden spoon");
        String str3 = new String("wooden spoon");
        String str4 = new String("wooden spoon");


        Scanner scan = new Scanner(System.in);



    }
}
