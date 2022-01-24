package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {

    public static void main(String[] args) {

        String [] names = new String[5];
        names [0] = "goku";
        names [1] = "neira";
        names [2] = "suat";
        names [3] = "hulya";
        names [4] = "mikhael";

        System.out.println(Arrays.toString(names));

        System.out.println("---------------------------------");

        String [] days = {"Monday", "Tuesday", "Wednesday", " Thursday", "Friday", "Saturday", "Sunday"};

        System.out.println(Arrays.toString(days));


        int number = 5;

        if(number < 1 || number > 7){
            System.err.println("invalid");
            System.exit(0);
        }

        System.out.println(days[number-1]);

    }
}
