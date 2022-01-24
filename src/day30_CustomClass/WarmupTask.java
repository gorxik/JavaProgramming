package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class WarmupTask {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,0,2,0,3,0,4,0));

        int size = list.size();
        list.removeAll(Arrays.asList(0));

        System.out.println(list);

        int newSize = list.size();

        int totalZeroz = size - newSize;

        System.out.println("totalZeroz = " + totalZeroz);

        for (int i = 0; i < totalZeroz ; i++) {
            list.add(0);
        }

        System.out.println(list);
    }
}
