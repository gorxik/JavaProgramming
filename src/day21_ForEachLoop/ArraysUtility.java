package day21_ForEachLoop;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysUtility {

    public static void main(String[] args) {
        int num[] = {1,2,3,4,5};

        System.out.println(num);


        System.out.println(Arrays.toString(num));

        System.out.println(num[0]);

        System.out.println("----------------");

        int [] scores = {95,55,100,70,80};

        Arrays.sort(scores);

        System.out.println(Arrays.toString(scores));

        System.out.println("min: " + scores[0]);
        System.out.println("max: " + scores[scores.length-1]);

        System.out.println("------------------");

        String [] names = {"Gunay" , "Anna", "Zuhal", "Ahmet", "Maria", "Sinem"};

        Arrays.sort(names);

        System.out.println(Arrays.toString(names));

        System.out.println("-------------");

        String[] words = {"Anna" , "ANNA"};

        Arrays.sort(words);

        System.out.println(Arrays.toString(words));

        System.out.println("--------------------------------");

        int[] arr1 = {1,3,2};
        int[] arr2 = {1,2,3};

        boolean r1 = Arrays.equals(arr1, arr2);

        System.out.println(r1);

        System.out.println("---------------");

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean r2 = Arrays.equals(arr1, arr2);

        System.out.println(r2);

        System.out.println("----------------------");

        char[] ch1 = {'a', 'c', 'b'};
        char[] ch2 = {'b', 'a', 'c'};


        Arrays.sort(ch1);
        Arrays.sort(ch2);

        boolean anagram = Arrays.equals(ch1, ch2);

        System.out.println(anagram);
    }
}
