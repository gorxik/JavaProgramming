package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.addAll(Arrays.asList("Ali", "David", "Ahmed", "Vali", "Deli"));
        names.retainAll(Arrays.asList("Ahmed", "David"));

        System.out.println(names);

        System.out.println("------------------------");

        String[] names2 = {"Mary", "Monica", "Mehray", "Sumeyra", "Hasan", "Beril"};

        ArrayList<String> list = new ArrayList<>(Arrays.asList(names2));


        list.removeIf(p-> p.charAt(0)=='M');

        System.out.println(list);

        names2 = list.toArray(new String[0]);

        System.out.println(Arrays.toString(names2));


    }
}
