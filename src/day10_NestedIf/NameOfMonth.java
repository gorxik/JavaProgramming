package day10_NestedIf;

public class NameOfMonth {

    public static void main(String[] args) {

        int n =65;
        String result = "";

        String a = (n == 1) ? "Jan" :(n==2)? "Feb"
                :(n==3)? "Mar" :(n==4)? "Apr"
                :(n==5)? "May" :(n==6)? "Jun"
                :(n==7)? "Jul" :(n==7)? "Aug"
                :(n==8)? "Sep" :(n==9)? "Oct"
                :(n==10)? "Nov" :(n==11)? "Dec"
                : "invalid";
        System.out.println(a);
    }
}
