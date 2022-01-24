package Taskssss;

import java.util.Arrays;

public class AnagramMethods {

    public static void main(String[] args) {

        anagram("lama", "alma");

    }

    public static void anagram (String word1, String word2){

        char [] ch1 = word1.toCharArray();
        char [] ch2 = word2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        boolean res = Arrays.equals(ch1,ch2);

        if(res){
            System.out.println("aaaaanagram");
        }else{
            System.out.println("yimedun getdi");
        }
        
        
            
        }


    }


