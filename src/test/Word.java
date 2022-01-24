package test;

import java.util.Scanner;
public class Word {

    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String word = scan.nextLine();

            int count = 0;

        for (int i = 0; i < word.length() -3; i++) {

            String s = word.substring(i,i+4);
            if (s.equals("java")){
                count++;
            }


        }


        System.out.println("countHi = " + count);
    }
}
