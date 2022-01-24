package day15_ForLoop;

import java.util.Scanner;

public class MinimumNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int min = 2147483647;

        for (int i = 0; i < 5; i++) {
            System.out.println("enter numbers");
            int num = input.nextInt();

            if(num < min){
                min = num;
            }
        }
        System.out.println("min = " + min);



    }

}

/*
ask user to enter 5 number and return to minimum number

 */