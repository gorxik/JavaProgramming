package day21_ForEachLoop;

public class MaxNumber {

    public static void main(String[] args) {

        int nums [] = {1,2,3,4,5,20,6,7};

        int max = nums[0];

        for (int each : nums) {
            if(each > max){
                max = each;
            }
        }

        System.out.println(max);


    }
}
