package day13_String;

import java.util.Locale;
import java.util.Scanner;

public class StringMethods {

    public static void main(String[] args) {

        //Scanner input = new Scanner (System.in);

        String s1 = "Batch 25 is the best batch";
        int totalChars = s1.length();
        System.out.println("totalChars = " + totalChars);

        char lastChar = s1.charAt(totalChars -1);
        System.out.println("lastChar = " + lastChar);

        String str = "wooden spoon";
        str = str.toUpperCase();
        System.out.println("str = " + str);

        String s = "JAVA";
        s = s.toUpperCase();
    }
}
