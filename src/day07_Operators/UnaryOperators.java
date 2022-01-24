package day07_Operators;

public class UnaryOperators {
    public static void main(String[] args) {

        int num1 = +25;
        int num2 = -25;

        System.out.println(num1 < 0); //false
        System.out.println(num2 < 0); //true

        System.out.println("-------------------");

        int a = 5;
        ++a;

        System.out.println(a);

        int b = 5;
        --b;

        System.out.println(b);

        int c = 100;

        System.out.println(++c); // pre increment increases the value by 1 right away

        int d = 100;

        System.out.println(d++); // post increment passes the current value
        System.out.println(d);

        System.out.println("------------------");

        int x = 200;

        System.out.println(--x); // pre decrement decreases the value by one right away

        int y = 200;

        System.out.println(y--); // post decrement fist passes the current value then decreases the value by one
        System.out.println(y);

        int z = 45;
        System.out.println(++z);  // 46
        System.out.println(z++); // 46
        System.out.println(z); // 47


        int q = 30;
        System.out.println(--q); // 29
        System.out.println(q--); //29 current value
        System.out.println(q); //28







    }

}
