package day24_CustomMethods_Return;

public class ReturnMethodPractice {

    public static void main(String[] args) {

        int maxNumber = nums(120,140);

        System.out.println(maxNumber);

        int multiply = maxNumber * 2;

        System.out.println(multiply);
    }

    public static int nums (int num1, int num2){
        int result = 0;

        if(num1>num2){
            result +=num1;
        }else{
            result +=num2;
        }

        return result;
    }

}
