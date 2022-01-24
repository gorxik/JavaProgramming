package day25_CustomMethods_Overloading;

import java.util.Arrays;

public class AddElementsToArray {

    public static void main(String[] args) {
        int arr [] ={1,2,3,4};

        arr = addInteger(arr, 5);

        System.out.println(Arrays.toString(arr));

        System.out.println("---------------------------");

        double [] arr2 = {1.4,2.6};

        arr2 = addDouble(arr2, 5.5);
        System.out.println(Arrays.toString(arr2));

        System.out.println("-----------------------------");

        String[] names = {"Tati", "Mati", "Pati"};

        names = addString(names, "Neira");

        System.out.println(Arrays.toString(names));

        System.out.println("------------------------------");

        char[] chars = {'A', 'B', 'C'};
        chars = addchar(chars, 'E');
        System.out.println(Arrays.toString(chars));
    }
    public static int [] addInteger(int[] array, int element){
        int result [] = new int [array.length+1];

        int i=0;

        for (int each:array) {
            result[i++] = each;
        }


        result[i] = element;

        return result;
    }

    public static double [] addDouble (double[] array, double element){
        double[] result = new double[array.length + 1];

        int i = 0;

        for (double each : array){
            result[i++] = each;

        }

        result[result.length-1] =element;
        return result;
    }

    public static String [] addString (String[] array, String element){
        String[] result = new String[array.length + 1];

        int i = 0;

        for (String each : array){
            result[i++] = each;

        }

        result[result.length-1] =element;
        return result;
    }

    public static char [] addchar (char[] array, char element){
        char[] result = new char[array.length + 1];

        int i = 0;

        for (char each : array){
            result[i++] = each;

        }

        result[result.length-1] =element;
        return result;
    }

}
