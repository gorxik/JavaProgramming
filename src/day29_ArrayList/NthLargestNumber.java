package day29_ArrayList;

import java.util.Collection;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;
public class NthLargestNumber {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,7,8));

        list.removeIf(p -> Collections.max(list) == p);
        list.removeIf(p -> Collections.max(list) == p);

        int n = 3;

        for (int i = 1; i <n ; i++) {
            list.removeIf(p-> Collections.max(list) == p);
        }



        int max = Collections.max(list);

        System.out.println(max);




    }
}
