package day15_ForLoop;

import java.util.Scanner;

public class SumOfNumber {

    public static void main(String[] args) {

        double sum = 0;

        for (int i = 0; i < 101; i++) {

            sum +=i;

        }
        System.out.println(sum);

        System.out.println("-------------------------------------");

        int total = 0;

        Scanner input  = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("enter a numbers");
            total += input.nextInt();

        }
        System.out.println("total: " + total);

        input.close();




    }
}
