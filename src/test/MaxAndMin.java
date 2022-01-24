package test;

import java.util.Arrays;
import java.util.Scanner;

public class MaxAndMin {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int [] nums = new int [10];

        for (int i = 0; i <10; i++) {
            System.out.println("ENTER 10 NUMBERS");

            nums[i] = input.nextInt();
        }
        Arrays.sort(nums);
        System.out.println("minimum " + nums[0]);
        System.out.println("maximum " + nums[9]);
    }
}

/* Write a program that asks user to enter a number 10 times:
            1. store all user entered numbers in an array
            2. find the max number
            3. find the min number

 */