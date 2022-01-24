package day08_IfStatements;

public class SwapTwoVariables_WithTemporaryVariable {
    public static void main(String[] args) {

        int a = 10;
        int b = 15;

        //-----------------------
        int c = 15;

        c = b; // 15
        b = a; // 10
        a = c; //15

        //-----------------------


        System.out.println("a = " + a);  //15
        System.out.println("b = " + b); //10
    }
}
