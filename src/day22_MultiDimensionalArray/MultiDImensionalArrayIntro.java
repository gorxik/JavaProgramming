package day22_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDImensionalArrayIntro {

    public static void main(String[] args) {

        String[] group1 = {"lulush" , "mulush" , "dulush"};
        String[] group2 = {"lulush" , "mulush" , "dulush"};
        String[] group3 = {"lulush" , "mulush" , "dulush"};

        String[][] groups = new String [3][];
        groups[0] = group1;
        groups[1] = group2;
        groups[2] = group3;

        System.out.println(Arrays.deepToString(groups));

        System.out.println("-------------------------------");


        int [][] arr2D = {{1,2,3}, {4,5,6}, {7,8,9}};

    }
}
