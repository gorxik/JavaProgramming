package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfMethod {

    public static void main(String[] args) {

        ArrayList<String> list3 = new ArrayList<>();

        list3.addAll(Arrays.asList("Java", "Python", "JavaScript", "C++", "C#", "Java", "Java"));

        list3.removeIf(each -> each.startsWith("J"));

        System.out.println(list3);

        System.out.println("----------------------");

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Anna", "Racecar", "Level", "eye", "Java", "Python", "Cydeo"));

       // names.removeIf(name -> StringUtiliy.isPalendrome(name));





    }

}
