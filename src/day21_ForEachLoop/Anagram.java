package day21_ForEachLoop;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        String str1 = "abcde";
        String str2 = "abced";

        char ch1 [] = str1.toCharArray();
        char ch2 [] = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        boolean anagram = Arrays.equals(ch1,ch2);

        if(anagram){
            System.out.println("annagram");
        }else{
            System.out.println("nopeee");
        }
    }
}
