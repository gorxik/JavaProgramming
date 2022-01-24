package ArrayPractice;

import java.util.Arrays;
import java.util.Scanner;

public class MaxAndMin {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter 10 nums");

        int nums [] = new int[10];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = input.nextInt();
        }

        int max = nums[0];

        for (int each : nums) {
            if(each > max){
                max = each;
            }
        }

        int min = nums[0];

        for (int each : nums) {
            if(each < min){
                min = each;
            }
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(max);
        System.out.println(min);
    }
}
