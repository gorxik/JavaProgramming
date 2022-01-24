package day06_PrimitiveTypeCastings;

public class ArithmeticOperators {

    public static void main(String[] args) {

        System.out.println("12" + 1);
        System.out.println(10 + 20);
        System.out.println(100 - 50);
        System.out.println(10 * 6);

        System.out.println(100 / 3);
        System.out.println(10.0 / 4);
        System.out.println(10 / 4.0);
        System.out.println(10d / 4);

        int a = 100;
        double b = a/6; //16.0      int / int = int. when int converts to double = 16.0

        System.out.println(b);

        double c= a/6.0; // 16.666666



        System.out.println(c);

        System.out.println(100d);

    }
}
