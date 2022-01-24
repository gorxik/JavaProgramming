package group7;

public class Frequency {

    public static void main(String[] args) {

        String str = "aabbcdea";

        String res = "";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
           count = 0;

            for (int j = 0; j < str.length(); j++ ){

                char each = str.charAt(j);
                count++;
            }


        }

        System.out.println(count);

    }

}
