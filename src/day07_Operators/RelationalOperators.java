package day07_Operators;

public class RelationalOperators {
    public static void main(String[] args) {

        boolean result1 = 20 > 40; //false

        System.out.println("result1 = " + result1);

        boolean result2 = 300 >= 150;

        System.out.println("result2 = " + result2);

        // apply for a loan. requirement is at least 720 credit score

        int score = 745;

        boolean isEligibleForLoan = score >= 720;

        boolean result5 = 100 < 120;
        System.out.println("result5 = " + result5);

        boolean result6 = 200 < 180;
        System.out.println("result6 = " + result6);

        int examScore = 59;
        boolean hasFailed = score <= 59;
        System.out.println("hasFailed = " + hasFailed);

        boolean result7 = 45 <= 60;

        System.out.println("result7 = " + result7);

        System.out.println("-----------");

        int i =100;
        double d = 123;
        float f = 300;

        System.out.println("f = " + f);

        i = (int)f;

        System.out.println("f = " + f);
        System.out.println("i = " + i);
        f = i;
        d = f;
        f = (float)d;
        d = i;
        i = (int)d;





    }


}
