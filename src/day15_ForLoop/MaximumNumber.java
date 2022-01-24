package day15_ForLoop;

import java.util.Scanner;

public class MaximumNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int max = -2147483648;

        for (int i = 0; i < 5; i++) {
            System.out.println(" enter number");
            int num = input.nextInt();

            if (num > max){
                max = num;
            }
        }

        System.out.println("max " + max);

    }
}


/*
write a program that ask a user to enter 5 number.
return to max number
 */