package day21_ForEachLoop;

import java.util.Arrays;

public class ReverseName {

    public static void main(String[] args) {

        String[] names = {"Elminur Ablimit", "Ali Kilic", "Hulya Keles", "Simen Kaya", "Begench Begenjov", "Ruveyda Durna",
                "Jonathan Holly", "Alshaun Rodgers", "Manas Kalenov", "Gulsen Sohret"};

        String reversed [] = new String [names.length];

        int j = 0;

        for (int i = names.length-1; i >=0; i--,j++) {
            reversed[j] = names[i];

        }

        System.out.println(Arrays.toString(reversed));


        System.out.println("-----------------------");

        String[] names2 = {"Elminur Ablimit", "Ali Kilic", "Hulya Keles", "Simen Kaya", "Begench Begenjov", "Ruveyda Durna",
                "Jonathan Holly", "Alshaun Rodgers", "Manas Kalenov", "Gulsen Sohret"};

        for (String each : names2) {
            String reversed2 = "";

            for (int i = each.length()-1; i >= 0; i--) {
                reversed2 +=each.charAt(i);
            }
            System.out.println(reversed2);
        }

    }
}
