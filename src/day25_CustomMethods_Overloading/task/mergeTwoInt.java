package day25_CustomMethods_Overloading.task;

import java.util.Arrays;

public class mergeTwoInt {

    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5,6};
        int arr2[] = {10,11};

        int[] total  = mergeMe(arr1,arr2);

        System.out.println(Arrays.toString(total));

    }

    public static int[] mergeMe (int[] arr1, int[] arr2){
        int [] array1={};
        int [] array2={};


        int total[]=new int[array1.length+array2.length];
        int i =0;

        for (int each : array1) {
            total[i++]=each;
        }

        for (int each: array2) {
            total[i++]=each;
        }



        return total;

    }

}

/*
create a method that can merge two integer arrays.
 merger(int[] arr1, int[] arr2)

2. create a method that can merge two double arrays.          merge(double[] arr1, double[] arr2)

3. create a method that can merge two char arrays.           merge(char[] arr1, char[] arr2)
4. create a method that can merge two String arrays.          merge(String[] arr1, String[] arr2)

 */
