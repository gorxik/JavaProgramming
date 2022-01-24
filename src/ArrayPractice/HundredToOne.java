package ArrayPractice;

import java.util.Arrays;

public class HundredToOne {

    public static void main(String[] args) {

        int nums [] = new int [100];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums.length-i;
        }
        System.out.println(Arrays.toString(nums));
    }
}
