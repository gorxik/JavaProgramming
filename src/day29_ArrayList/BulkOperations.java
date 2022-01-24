package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,8,8,5,5,3,3));

        System.out.println(list);

        list.remove((Arrays.asList(3,5,8)));

        System.out.println(list);

        System.out.println("----------------------");

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.addAll(Arrays.asList(100,200,300,400,500,600,700,800,900));

        numbers.retainAll(Arrays.asList(100,200,300));

        System.out.println(numbers);

        System.out.println("----------------------");




    }

}
