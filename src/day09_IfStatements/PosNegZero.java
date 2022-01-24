package day09_IfStatements;

public class PosNegZero {

    public static void main(String[] args) {

        int n = 0;

        n = n + 6 + 7 - 18 + 9 + 8 +4 + 7 / 98 -5 * 6 +5 + 9 / 7 * 17;

        if(n>0) {
            System.out.println("Positive " + n);
        }
        else if(n<0){
            System.out.println("Negative " + n);
        }
        else {
            System.out.println("Zero " +n);
        }
    }
}
