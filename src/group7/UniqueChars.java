package group7;

public class UniqueChars {

    public static void main(String[] args) {

        String str = "aabbcddeff";

        String res = "";

        for (int i = 0; i < str.length(); i++) {

            String ch = "" + str.charAt(i);

                if(str.indexOf(ch) == str.lastIndexOf(ch)){

                    res += ch;

                }

        }
        System.out.println(res);


    }
}
