package day09_IfStatements;

public class MedianNumber {

    public static void main(String[] args) {

        int a = 10, b = 20, c = 30;

        if ((a > b && a < c) || (a > c && a < b)) {

            System.out.println(a + "(a) is the median number");
        }
        if ((b > a && b < c) || (b > c && b < a)){

            System.out.println(b + "(b) is the median number");
        }
        if ((c > b && c < a) || (c > a && c < b)){

            System.out.println( c + "(c) is the median number");
        }
    }
}
