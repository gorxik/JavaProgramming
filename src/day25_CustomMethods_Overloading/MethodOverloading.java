package day25_CustomMethods_Overloading;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.Arrays;

public class MethodOverloading {

    public static void main(String[] args) {

        int [] intArray = { 5,6,0,-1,3,4};
        Arrays.sort(intArray);

        double[] doubleArray = {10.5, 11.9, 14.5};
        Arrays.sort(doubleArray);

        char [] charArray = {'D', 'B', 'C', 'A'};
        Arrays.sort(charArray);

        sumOfNumbers(10,20,4,556);
    }


    public static int sumOfNumbers(int num1, int num2){
        return num1+num2;
    }
    public static int sumOfNumbers(int num1, int num2, int num3){
        return num1+num2+num3;
    }
    public static int sumOfNumbers(int num1, int num2,int num3, int num4){
        return num1+num2+num3+num4;
    }
}
