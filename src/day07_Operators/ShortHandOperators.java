package day07_Operators;

public class ShortHandOperators {

    public static void main(String[] args) {

        // assignment operator: =
        int number = 100;

        System.out.println("number = " + number); //100

        number = 200;

        System.out.println("number = " + number); // 200

        String word = "Java Programming";

        System.out.println("word = " + word);

        word = "wooden spoon";

        System.out.println("word = " + word);

        word = "cydeo";

        System.out.println("word = " + word);

        System.out.println("-----------------");

        int x = 100;

        System.out.println("x = " + x);

        // x = x+ 200;

        x += 200;

        System.out.println("x = " + x);

        String str = "Wooden";

        str += " Spoon";

        System.out.println("str = " + str);

        double num1 = 2.5;

        System.out.println("num1 = " + num1);

        num1 += 5.5;
        System.out.println("num1 = " + num1);

        double availableBalance = 1000.50;
        availableBalance -= 140;
        availableBalance += 300;

        System.out.println("availableBalance = " + availableBalance);


        System.out.println("---------------------");

        double salary = 50000.50;
        System.out.println("salary = " + salary);
        salary *= 2;

        System.out.println("salary = " + salary);

        double dodge = 0.000001;
        dodge *= 100000000;

        System.out.println("dodge = " + dodge);

        double num2 = 25000;
        System.out.println("num2 = " + num2);
        num2 /= 2;

        System.out.println("num2 = " + num2);

        System.out.println("---------------");

        int y = 300;
        System.out.println("y = " + y);

        y %= 16;

        System.out.println("y = " + y);

        System.out.println("--------");

        int balance = 3500;

        // insurance fee: 153

        balance %=153;

        System.out.println("balance = " + balance);
    }
}
