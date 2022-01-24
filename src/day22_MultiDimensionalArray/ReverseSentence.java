package day22_MultiDimensionalArray;

public class ReverseSentence {

    public static void main(String[] args) {

        String sencente = "Hi how are you?";

        String[] words = sencente.split(" ");

        String reversed = "";

        for (int i = words.length-1; i >= 0 ; i--) {
            reversed += words[i] + " ";

        }

        System.out.println(reversed);
    }
}
