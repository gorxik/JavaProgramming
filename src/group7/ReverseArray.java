package group7;

import java.util.Arrays;
public class ReverseArray {

    public static void main(String[] args) {


        String months[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

        for (int i = 0, j = months.length - 1; i < months.length / 2; i++, j--) {

            String temp = months[0];

            temp = months[i];
            months[i] = months[j];
            months[j] = temp;


        }
        System.out.println(Arrays.toString(months));
    }
}