package day17_While_DoWhile;

public class FrequencyOfWord {

    public static void main(String[] args) {

        String str = "JavaJavaJavaJavaJavaJavaJavaJava";
        int frequency = 0;
        for (int i = 0; i < str.length()-3; i++) {
            String eachSub = str.substring(i,i+4);

            if (eachSub.equals("Java")){
                frequency++;

            }

        }
        System.out.println("frequency = " + frequency);
    }
}
