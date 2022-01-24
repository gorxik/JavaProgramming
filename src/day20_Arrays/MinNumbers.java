package day20_Arrays;

public class MinNumbers {

    public static void main(String[] args) {

        int numbers [] = {10,20,30,40,5,60};

        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] < min){
                min = numbers[i];
            }

        }

        System.out.println(min);



    }
}
