package day06_PrimitiveTypeCastings;

public class PrimitiveCastings {
    public static void main(String[] args) {

        byte a = 100;
        short b = a;
        // compiler converts a

        int c = b; //implicit casting

        long d = c;

        float e = d;
        double f = e;

        System.out.println("________________________________");

        int x = 55;
        short y = (short) x; // explicit casting

        System.out.println(x + ":" + y);

        long j = 1000000;
        short k = (short) j;


        System.out.println(k);


        double l = 2.5;
        float m = (float)l;

        System.out.println(m);

        double n = 10.8;
        int s = (int) n;

        System.out.println(s);

        double d1 = 20.5;
        short s1 = (short) d1;

        System.out.println( d1 +":"+ s1);


        float f1 = 30.5f;
        long l1 = (long) f1;






    }
}
