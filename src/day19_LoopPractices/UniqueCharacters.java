package day19_LoopPractices;

import java.sql.PreparedStatement;

public class UniqueCharacters {

    public static void main(String[] args) {

    String str = "aabccdeef";

        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                char each = str.charAt(i);

                    if (ch == each) {
                        count++;
                    }

            }
            if (count ==1){

            }

        }




    }
}
